import datetime
import random
from dataclasses import dataclass, field
from models.db_model import Events
from app.server import server
from db.db_connect_sqlalchemy_over_flask import db

LONGITUDE_START = 0
LONGITUDE_END = 1600
LATITUDE_START = 0
LATITUDE_END = 1600
DANGER_DISTANCE = 100


def round_seconds(obj: datetime.datetime) -> datetime.datetime:
    if obj.microsecond >= 500_000:
        obj += datetime.timedelta(seconds=1)
    return obj.replace(microsecond=0)


def calculate_distance(point_1, point_2):
    return ((point_1.latitude - point_2.latitude) ** 2 + (point_1.longitude - point_2.longitude) ** 2) ** 0.5


#
@dataclass
class SystemComponent:
    id: int
    longitude: float
    latitude: float
    speed: float
    type: str
    battery_charge_status: float = 100.0
    steps: int = 0
    longitude_direction: int = random.choice([-1, 1])
    latitude_direction: int = random.choice([-1, 1])
    nearest_danger_object_id: int = 10E6
    nearest_danger_object_meters: float = 10E6
    is_danger_area: int = 0

    def move(self, time_step):
        self.battery_charge_status = 100.0 if (self.battery_charge_status - random.random()) <= 0 else (
                self.battery_charge_status - random.random())
        self.steps += 1
        distance = self.speed * time_step
        delta_x = random.random() * distance
        delta_y = (distance ** 2 - delta_x ** 2) ** 0.5

        if not LONGITUDE_START < self.longitude + delta_x * self.longitude_direction < LONGITUDE_END:
            self.longitude_direction *= -1
        if not LATITUDE_START < self.latitude + delta_y * self.latitude_direction < LATITUDE_END:
            self.latitude_direction *= -1
        self.latitude += delta_y * self.latitude_direction
        self.longitude += delta_x * self.longitude_direction


@dataclass
class TagData(SystemComponent):
    type: str = 'tag'


@dataclass
class BlockData(SystemComponent):
    type: str = 'block'
    danger_area: float = DANGER_DISTANCE

    def __post_init__(self):
        self.speed_before_stop = self.speed

class Tag(TagData):
    pass


class Block(BlockData):
    pass



@dataclass
class Map:
    tags: [Tag] = field(default_factory=list)
    blocks: [Block] = field(default_factory=list)
    longitude_start: int = LONGITUDE_START
    longitude_end: int = LONGITUDE_END
    latitude_start: int = LATITUDE_START
    latitude_end: int = LATITUDE_END
    time_delta_seconds: int = 0

    def move_block(self, block: Block, time_step=1):
        block.speed_before_stop = block.speed if block.speed else block.speed_before_stop
        block.is_danger_area = 0
        min_distance_between_this_block_and_other_component = min([calculate_distance(block, el) for el
                                                                   in self.tags + self.blocks if el != block])
        min_distance_other_id = block.id
        for el in self.tags + self.blocks:

            if block != el:
                distance_between_this_block_and_other_el = calculate_distance(block, el)
                if distance_between_this_block_and_other_el == min_distance_between_this_block_and_other_component:
                    min_distance_other_id = el.id
                if distance_between_this_block_and_other_el < block.danger_area:
                    if block.speed:
                        block.speed_before_stop = block.speed
                    block.speed = 0
                    block.is_danger_area = 1
                    el.is_danger_area = 1

        if block.is_danger_area and block.speed == 0:
            if all([calculate_distance(block, tag) > block.danger_area for tag in self.tags]):
                block.speed = block.speed_before_stop
                block.move(time_step=time_step)

        if not block.is_danger_area and block.speed == 0:
            block.speed = block.speed_before_stop

        block.move(time_step=time_step)
        block.nearest_danger_object_meters = min_distance_between_this_block_and_other_component
        block.nearest_danger_object_id = min_distance_other_id

    def move_elements(self, block_id=None, block_speed=None, add_into_db=False):
        self.time_delta_seconds += random.randint(20, 1000)
        if block_id and block_speed:
            for block in self.blocks:
                if block.id == block_id:
                    block.speed = block_speed
        for tag in self.tags:
            tag.is_danger_area = 0
            tag.move(time_step=1)
        for block in self.blocks:
            self.move_block(block=block, time_step=1)
        if add_into_db:
            with server.app_context():
                for element in self.tags + self.blocks:
                    db.session.add(Events(component_id=element.id, component_type=element.type,
                                          latitude=round(element.latitude, 2), longitude=round(element.longitude, 2),
                                          battery_charge_status=round(element.battery_charge_status, 2),
                                          event_dt=round_seconds(datetime.datetime.now() +
                                                                 datetime.timedelta(seconds=self.time_delta_seconds)),
                                          is_danger=element.is_danger_area,
                                          nearest_danger_object_id=element.nearest_danger_object_id,
                                          nearest_danger_object_meters=element.nearest_danger_object_meters
                                          ))
                db.session.commit()

from db.db_connect_sqlalchemy import session
from models.main_model import Map, Tag, Block
import time
import random

current_map = Map()
N_TAGS = 100
N_BLOCKS = 10

for i in range(1, N_TAGS + 1):
    current_map.tags.append(Tag(id=i,
                                speed=random.randint(20, 30),
                                longitude=random.randint(1, 1000),
                                latitude=random.randint(1, 1000)))

for i in range(N_TAGS + 1, N_TAGS + N_BLOCKS):
    current_map.blocks.append(Block(id=i,
                                    speed=random.randint(100, 200),
                                    longitude=random.randint(1, 1000),
                                    latitude=random.randint(1, 1000)))

while True:
    current_map.move_elements(add_into_db=True)
    time.sleep(0.1)

import sqlalchemy as orm
from sqlalchemy.engine import URL
from config.config import config_sql_alchemy
from sqlalchemy import Column, Integer, DateTime, Text, Numeric
from sqlalchemy.orm import declarative_base, sessionmaker

URL = URL.create(
    drivername="postgresql",
    username=config_sql_alchemy.db.db_user,
    host=config_sql_alchemy.db.db_host,
    port=config_sql_alchemy.db.db_port,
    database=config_sql_alchemy.db.database,
    password=config_sql_alchemy.db.db_pass
)

engine = orm.create_engine(URL)
Base = declarative_base()


class Events(Base):
    __tablename__ = 'Events'

    id = Column(Integer(), primary_key=True)
    component_id = Column(Integer())
    component_type = Column(Text())
    battery_charge_status = Column(Numeric())
    latitude = Column(Numeric())
    longitude = Column(Numeric())
    is_danger = Column(Integer())
    nearest_danger_object_id = Column(Integer(), default=10E6)
    nearest_danger_object_meters = Column(Numeric(), default=10E6)
    event_dt = Column(DateTime())


# try:
#     Events.__table__.drop(engine)
# except:
#     pass
Base.metadata.create_all(engine)
Session = sessionmaker(bind=engine)
session = Session()

from dataclasses import dataclass
from dotenv import dotenv_values

env = dotenv_values(".env")


@dataclass
class DataBaseConfig:
    database: str
    db_host: str
    db_port: str
    db_user: str
    db_pass: str


@dataclass
class ConfigSQLAlchmey:
    db: DataBaseConfig


class ConfigSQLAlchemyOverFlask(object):
    SQLALCHEMY_DATABASE_URI = str(env.get("safe_db_URI"))
    SQLALCHEMY_TRACK_MODIFICATIONS = False


config_sql_alchemy = ConfigSQLAlchmey(db=DataBaseConfig(database=env.get("safe_db"),
                                                        db_host=env.get("safe_host"),
                                                        db_port=env.get("safe_port"),
                                                        db_user=env.get("safe_user"),
                                                        db_pass=env.get("safe_pass")))

if __name__ == "__main__":
    print(safe_db_URI)

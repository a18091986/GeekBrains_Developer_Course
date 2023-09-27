from flask import Flask
from db.db_connect_sqlalchemy_over_flask import db
from config.config import ConfigSQLAlchemyOverFlask

server = Flask(__name__)
server.config.from_object(ConfigSQLAlchemyOverFlask)
db.init_app(server)
with server.app_context():
    db.create_all()


def create_app():
    from .dashboard import create_dashapp
    dash_app = create_dashapp(server)
    return dash_app  # or dash app if you use debug mode in dash

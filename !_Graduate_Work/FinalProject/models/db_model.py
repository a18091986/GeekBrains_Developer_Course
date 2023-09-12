from db.db_connect_sqlalchemy_over_flask import db


class Events(db.Model):
    __tablename__ = 'Events'

    id = db.Column(db.Integer, primary_key=True)
    component_id = db.Column(db.Integer)
    component_type = db.Column(db.Text)
    battery_charge_status = db.Column(db.Numeric)
    latitude = db.Column(db.Numeric)
    longitude = db.Column(db.Numeric)
    is_danger = db.Column(db.Integer)
    nearest_danger_object_id = db.Column(db.Integer, default=10E6)
    nearest_danger_object_meters = db.Column(db.Numeric, default=10E6)
    event_dt = db.Column(db.DateTime)

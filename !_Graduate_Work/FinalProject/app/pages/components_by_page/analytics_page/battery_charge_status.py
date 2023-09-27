import dash_bootstrap_components as dbc
import plotly.express as px
from dash import dcc, html
import pandas as pd
import time


def generate_date_slider(df, date_number=None, visibility=True):
    date_number = date_number if date_number else 0
    df['date'] = df['event_dt'].apply(lambda x: pd.to_datetime(x).date().day)
    date_dict = {i: date_val for i, date_val in enumerate(map(str, df.date.unique()))}
    date = df.date.max() if not date_number else date_dict.get(date_number)
    style = {'visibility': 'hidden'} if not visibility else {}
    slider = html.Div(
        [
            dbc.Label("Выбери день"),
            dcc.Slider(min(date_dict), max(date_dict),
                       marks={x: {"label": date_dict.get(x),
                                  "style": {'transform': 'rotate(45deg)'}} for x in date_dict},
                       value=date_number, step=None,
                       id='battery_charge_status_date_slider')
        ],
        className="d-grid gap-2 col-6 mx-auto", style=style
    )
    return slider


def generate_slider_and_bar_charge_status(df, date_number):
    date_number = date_number if date_number else 0
    df['date'] = df['event_dt'].apply(lambda x: pd.to_datetime(x).date())
    df['component_id_str'] = df['component_id'].apply(lambda x: f"{x} ")
    date_dict = {i: date_val for i, date_val in enumerate(df.date.unique())}
    date = date_dict.get(date_number)
    figure = px.bar(df[df['date'] == date].
                    groupby('component_id_str')[['battery_charge_status']].
                    mean().reset_index(), x='component_id_str', y="battery_charge_status")
    return figure

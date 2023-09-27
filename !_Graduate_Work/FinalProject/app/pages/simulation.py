import datetime

import dash_bootstrap_components as dbc
import dash
from dash import dcc, Output, Input, callback, ctx, State
import plotly.graph_objects as go

from app.pages.components_by_page.simulation_page.simulation_page import generate_dropdown_speed_block_id_in_simulation, \
    generate_slider_speed_in_simulation, generate_button_speed_submit_in_simulation, \
    generate_dropdown_danger_area_block_id_in_simulation, generate_slider_danger_area_in_simulation, \
    generate_button_danger_area_submit_in_simulation, generate_scatter
from assets.dbc_styles import CONTENT_STYLE
from models.main_model import Map, Tag, Block
import random
N_TAGS = 5
N_BLOCKS = 3

current_map = Map()

for i in range(1, N_TAGS + 1):
    direction_x = random.choice([-1, 1])
    direction_y = random.choice([-1, 1])
    current_map.tags.append(Tag(id=i,
                                speed=20,
                                longitude_direction=direction_x,
                                latitude_direction=direction_y,
                                longitude=random.randint(1, 500),
                                latitude=random.randint(500, 1000)))

for i in range(N_TAGS + 1, N_TAGS + N_BLOCKS):
    direction_x = random.choice([-1, 1])
    direction_y = random.choice([-1, 1])
    current_map.blocks.append(Block(id=i,
                                    speed=100,
                                    longitude_direction=direction_x,
                                    latitude_direction=direction_y,
                                    longitude=random.randint(1, 1000),
                                    latitude=random.randint(1, 1000)))


dash.register_page(__name__, path='/simulation')
layout = dbc.Container([
    dbc.Row([dbc.Col([generate_dropdown_speed_block_id_in_simulation(current_map),
                      generate_slider_speed_in_simulation(),
                      generate_button_speed_submit_in_simulation()]),
             dbc.Col([generate_dropdown_danger_area_block_id_in_simulation(current_map),
                      generate_slider_danger_area_in_simulation(),
                      generate_button_danger_area_submit_in_simulation()])]),
    dbc.Row([dcc.Graph(id='movement_simulation', className="md-12")], align='center'),
    dcc.Interval(
        id='interval_component',
        interval=1 * 1000,
        n_intervals=0
    )],
    style=CONTENT_STYLE)


@callback(
    Output('movement_simulation', 'figure'),
    Input('interval_component', 'n_intervals'),
    Input('button_speed_submit_in_simulation', 'n_clicks'),
    State('dropdown_speed_block_id_in_simulation', 'value'),
    State('slider_speed_in_simulation', 'value'),
    Input('button_danger_area_submit_in_simulation', 'n_clicks'),
    State('dropdown_danger_area_block_id_in_simulation', 'value'),
    State('slider_danger_area_in_simulation', 'value'),
)
def update_graph(n, btn_speed, block_id_speed, slider_value_speed,
                 btn_danger_area, block_id_danger_area, slider_danger_area):
    print(f"{datetime.datetime.now()}: simulation page callback")
    if "button_speed_submit_in_simulation" == ctx.triggered_id:
        for bl in current_map.blocks:
            if block_id_speed and bl.id == int(block_id_speed):
                bl.speed = slider_value_speed

    elif "button_danger_area_submit_in_simulation" == ctx.triggered_id:
        for bl in current_map.blocks:
            if block_id_danger_area and bl.id == int(block_id_danger_area):
                bl.danger_area = slider_danger_area

    current_map.move_elements()
    fig = go.Figure()
    fig.update_layout(height=800)
    fig.update_yaxes(range=[0, 1600])
    fig.update_xaxes(range=[0, 1600])

    for el in current_map.tags + current_map.blocks:
        fig.add_trace(generate_scatter(el, color="Red" if el.is_danger_area == 1 else "Green"))
    return fig

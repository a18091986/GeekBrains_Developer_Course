from dash import dcc, html
import dash_bootstrap_components as dbc
import plotly.graph_objects as go


def generate_dropdown_speed_block_id_in_simulation(current_map):
    return html.Div(
        [
            dbc.Label("Выбери блок для изменения его скорости", html_for="dropdown"),
            dcc.Dropdown(
                id="dropdown_speed_block_id_in_simulation",
                options=[{"label": f"{x}", "value": f"{x}"} for x in [bl.id for bl in current_map.blocks]]
            ),
        ],
        className="mb-3",
    )


def generate_slider_speed_in_simulation():
    return html.Div(
        [
            dbc.Label("Выбери скорость", html_for="slider"),
            dcc.Slider(id="slider_speed_in_simulation", min=10, max=200, step=40, value=100),
        ],
        className="mb-3",
    )


def generate_button_speed_submit_in_simulation():
    return html.Div(dbc.Button("Применить настройки скорости",
                               color="primary",
                               id='button_speed_submit_in_simulation', n_clicks=0),
                    className="d-grid gap-2 col-12 mx-auto")


def generate_dropdown_danger_area_block_id_in_simulation(current_map):
    return html.Div(
        [
            dbc.Label("Выбери блок для регулировки зоны обнаружения", html_for="dropdown"),
            dcc.Dropdown(
                id="dropdown_danger_area_block_id_in_simulation",
                options=[{"label": f"{x}", "value": f"{x}"} for x in [bl.id for bl in current_map.blocks]]
            ),
        ],
        className="mb-3",
    )


def generate_slider_danger_area_in_simulation():
    return html.Div(
        [
            dbc.Label("Выбери дальность обнаружения", html_for="slider"),
            dcc.Slider(id="slider_danger_area_in_simulation", min=10, max=300, step=50, value=100),
        ],
        className="mb-3",
    )


def generate_button_danger_area_submit_in_simulation():
    return html.Div(dbc.Button("Применить настройки зоны обнаружения",
                               color="primary",
                               id='button_danger_area_submit_in_simulation', n_clicks=0),
                    className="d-grid gap-2 col-12 mx-auto")


def generate_scatter(obj, color='Green'):
    size, border = (10, 1) if obj.type == 'tag' else (20, 2)
    return go.Scatter(
        x=(obj.latitude,),
        y=(obj.longitude,),
        mode='markers',
        marker=dict(
            color=color,
            size=size,
            line=dict(
                color='Black',
                width=border)
        ),
        showlegend=False
    )
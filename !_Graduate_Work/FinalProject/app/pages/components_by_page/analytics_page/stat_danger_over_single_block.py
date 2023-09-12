import plotly.express as px
from dash import html, dcc
import dash_bootstrap_components as dbc


def generate_hidden_menu(df):

    menu = df[(df['is_danger'] == 1) & (df['component_type'] == 'block')]['component_id'].unique()

    dropdown = html.Div(
        [
            dbc.Label("Выбери id блока", html_for="dropdown"),
            dcc.Dropdown(
                id="dropdown_in_analytics_with_block_id",
                value=menu[0],
                options=[{"label": x, "value": x} for x in menu]
            ),
        ],
        className="d-grid gap-2 col-6 mx-auto", style={'visibility': 'hidden'}
    )
    return dropdown


def generate_menu_and_bar_stat_danger_over_single_block(df, block_id):

    menu = df[(df['is_danger'] == 1) & (df['component_type'] == 'block')]['component_id'].unique()
    df_danger_events = (
        (df[(df['is_danger'] == 1) & (df['component_type'] == 'block') & (df['component_id'] == block_id)].
        groupby(["nearest_danger_object_id"]).count().reset_index()[
            ['component_id', 'nearest_danger_object_id', 'id']]).
        rename(columns={"nearest_danger_object_id": "Номер метки", "id": "Количество опасных ситуаций"}))

    dropdown = html.Div(
        [
            dbc.Label("Выбери id блока", html_for="dropdown"),
            dcc.Dropdown(
                id="dropdown_in_analytics_with_block_id",
                value=block_id,
                options=[{"label": x, "value": x} for x in menu]
            ),
        ],
        className="d-grid gap-2 col-6 mx-auto",
    )

    df_danger_events['Номер метки'] = df_danger_events['Номер метки'].apply(lambda x: f"{x} ")

    figure = px.bar(df_danger_events, x='Номер метки', y="Количество опасных ситуаций")

    return figure, dropdown

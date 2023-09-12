import dash
import pandas as pd
from dash import dcc, html, Input, Output, State, ctx, callback
import dash_bootstrap_components as dbc
import datetime

from app.pages.components_by_page.analytics_page.battery_charge_status import generate_date_slider, \
    generate_slider_and_bar_charge_status
from app.pages.components_by_page.analytics_page.danger_sectors_scatter import generate_scatter_danger_zones
from app.pages.components_by_page.analytics_page.in_progress_template import generate_empty_graph
from app.pages.components_by_page.analytics_page.stat_danger_over_all_blocks import \
    generate_bar_stat_danger_over_all_blocks
from app.pages.components_by_page.analytics_page.stat_danger_over_single_block import \
    generate_menu_and_bar_stat_danger_over_single_block, generate_hidden_menu
from db.db_connect_sqlalchemy import engine

from app.pages.components_by_page.analytics_page.common import generate_main_dropdown_in_analytics
from assets.dbc_styles import CONTENT_STYLE

df = pd.read_sql_table('Events', engine)

dash.register_page(__name__, path='/analytics')
layout = dbc.Container(
    [
        dbc.Row([generate_main_dropdown_in_analytics()], align="center"),
        dbc.Row(id="for_text", align="center"),
        dbc.Row(generate_hidden_menu(df), id="for_other_dropdown_in_analytics", align="center"),
        dbc.Row(generate_date_slider(df, visibility=False), id="for_slider_in_analytics", align="center"),
        # dbc.Table.from_dataframe(df_danger_events, striped=True, bordered=True, hover=True),
        dbc.Row([dcc.Graph(figure=generate_bar_stat_danger_over_all_blocks(df), id='analitycs_graph_first',
                           className="md-12")], align='center')
    ],
    style=CONTENT_STYLE
)


@callback(
    Output('analitycs_graph_first', 'figure'),
    Output('for_other_dropdown_in_analytics', 'children'),
    Output('for_slider_in_analytics', 'children'),
    Output('for_text', 'children'),
    Input("main_dropdown_in_analytics", 'value'),
    Input("dropdown_in_analytics_with_block_id", 'value'),
    Input("battery_charge_status_date_slider", 'value'),
    config_prevent_initial_callbacks=True

)
def update_graph(main_dropdown_menu_value, dropdown_in_analytics_with_block_id_value, date_slider_value):
    print(f"{datetime.datetime.now()}: analytics page callback")
    if main_dropdown_menu_value == "Статистика возникновения опасных ситуаций по всем блокам":
        return generate_bar_stat_danger_over_all_blocks(df), None, None, None
    elif main_dropdown_menu_value == "Статистика возникновения опасных ситуаций по отдельному блоку":
        menu, graph = generate_menu_and_bar_stat_danger_over_single_block(df, dropdown_in_analytics_with_block_id_value)
        return menu, graph, None, None
    elif main_dropdown_menu_value == "Распределение потенциально опасных мест на карте":
        return generate_scatter_danger_zones(df), None, None, None
    elif main_dropdown_menu_value == "Состояние заряда батарей меток":
        slider = generate_date_slider(df, date_number=date_slider_value, visibility=True)
        graph = generate_slider_and_bar_charge_status(df, date_slider_value)
        return graph, None, slider, None
    else:
        return generate_empty_graph(), '', html.Div([html.H2("В РАЗРАБОТКЕ")])



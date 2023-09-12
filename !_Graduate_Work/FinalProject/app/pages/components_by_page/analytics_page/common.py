from dash import html, dcc
import dash_bootstrap_components as dbc

main_menu = [
    "Статистика возникновения опасных ситуаций по всем блокам",
    "Статистика возникновения опасных ситуаций по отдельному блоку",
    "Распределение потенциально опасных мест на карте",
    "Состояние заряда батарей меток"
]


def generate_main_dropdown_in_analytics():
    return html.Div(
        [
            dbc.Label("Выбери интересующий пункт из выпадающего списка", html_for="dropdown"),
            dcc.Dropdown(
                id="main_dropdown_in_analytics",
                value="Статистика возникновения опасных ситуаций по всем блокам",
                options=[{"label": x, "value": x} for x in main_menu]
            ),
        ],
        className="d-grid gap-2 col-6 mx-auto",
    )



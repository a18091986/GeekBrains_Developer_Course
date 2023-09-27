from dash import html
import dash_bootstrap_components as dbc
from assets.dbc_styles import SIDEBAR_STYLE

sidebar = html.Div(
    [
        html.H2("PredictIT", className="display-8"),
        html.Hr(),
        dbc.Nav(
            [
                dbc.NavLink("Описание", href="/", active="exact"),
                dbc.NavLink("Моделирование", href="/simulation", active="exact"),
                dbc.NavLink("Аналитика", href="/analytics", active="exact"),
            ],
            vertical=True,
            pills=True,
        ),
        html.Hr(),
    ],
    style=SIDEBAR_STYLE,
)
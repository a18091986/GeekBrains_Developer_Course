import dash
import dash_bootstrap_components as dbc
from dash import html
from app.pages.components_by_page.sidebar import sidebar


def create_dashapp(server):
    app = dash.Dash(external_stylesheets=[dbc.themes.BOOTSTRAP],
                    server=server,
                    use_pages=True,
                    suppress_callback_exceptions=True)

    app.layout = html.Div([sidebar, dash.page_container])

    return app

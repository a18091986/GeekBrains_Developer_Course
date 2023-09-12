import plotly.graph_objects as go


def generate_empty_graph():
    fig = go.Figure()
    fig.update_layout(height=800)
    fig.update_yaxes(range=[0, 1600])
    fig.update_xaxes(range=[0, 1600])
    return fig

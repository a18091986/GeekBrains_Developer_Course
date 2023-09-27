import plotly.express as px


def generate_bar_stat_danger_over_all_blocks(df):
    df_danger_events = ((df[(df['is_danger'] == 1) & (df['component_type'] == 'block')].
    groupby(["component_id"]).count().reset_index()[['component_id', 'id']]).
                        rename(columns={"id": "Количество опасных ситуаций", "component_id": "Номер блока"}))

    df_danger_events['Номер блока'] = df_danger_events['Номер блока'].apply(lambda x: f"{x} ")

    figure = px.bar(df_danger_events, x='Номер блока', y="Количество опасных ситуаций")
    return figure

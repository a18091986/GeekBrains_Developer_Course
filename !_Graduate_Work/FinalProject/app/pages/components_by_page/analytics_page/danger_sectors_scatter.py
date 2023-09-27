import plotly.express as px
from models.main_model import LONGITUDE_START, LONGITUDE_END, LATITUDE_START, LATITUDE_END

MAP_SECTORS_STEP = 100
MAP_SECTORS_NUMBER = int(LONGITUDE_END / MAP_SECTORS_STEP)


def calculate_sector_number(lat, long, sectors_centers_coords):
    for sector_index, (x, y) in enumerate(sectors_centers_coords):
        if ((x - 50 <= lat < x + 50) and (y - 50 <= long < y + 50)):
            return sector_index


def generate_sectors_coords():
    sectors_centers_coords = []
    for i in range(0, MAP_SECTORS_NUMBER):
        for j in range(0, MAP_SECTORS_NUMBER):
            sectors_centers_coords.append((i * MAP_SECTORS_STEP + 50, j * MAP_SECTORS_STEP + 50))
    return sectors_centers_coords


def generate_scatter_danger_zones(df):
    sectors_centers_coords = generate_sectors_coords()

    df_temp = df.copy()
    df_temp['sector_center'] = (df[['latitude', 'longitude']].
                                apply(lambda row: calculate_sector_number(row['latitude'], row['longitude'],
                                                                          sectors_centers_coords), axis=1))

    df_danger_sectors = df_temp.groupby('sector_center').count().sort_values('id')['id'].reset_index()
    df_danger_sectors['x'] = df_danger_sectors.apply(lambda row: sectors_centers_coords[row['sector_center']][0],
                                                     axis=1)
    df_danger_sectors['y'] = df_danger_sectors.apply(lambda row: sectors_centers_coords[row['sector_center']][1],
                                                     axis=1)
    df_danger_sectors['Количество опасных ситуаций'] = df_danger_sectors['id']
    df_danger_sectors['symbols'] = 'square_form'

    figure = px.scatter(df_danger_sectors, x='x', y='y', size='Количество опасных ситуаций', size_max=100,
                        symbol=df_danger_sectors['symbols'], symbol_sequence=['square'],
                        width=1400, height=1400, labels=False)
    figure.update_layout(showlegend=False)

    return figure

import os


def get_info_from_user():
    return ' '.join([input(question) for question
                     in ['Введи имя:\n', 'Введи отчество:\n', 'Введи фамилию:\n', 'Введи телефон:\n']])


def add_info():
    with open('phones.txt', 'a', encoding='utf-8') as f:
        f.write(get_info_from_user() + '\n')


def find_info():
    find_str = input("Что будем искать?\n")
    result = []
    with open('phones.txt', 'r', encoding='utf-8') as f:
        for line in f.readlines():
            if find_str in line:
                result.append(line)
    return result if result else [0]


def change_info():
    users = find_info()
    for index, user in enumerate(users):
        print(f'Найдено: {index}: {user}' if user else f"информации не найдено")
    index = int(input("Введи номер пользователя для замены: \n"))
    with open('phones.txt', 'r', encoding='utf-8') as f_old, open('phones_new.txt', 'w', encoding='utf-8') as f_new:
        for line in f_old.readlines():
            if users[index] not in line:
                f_new.write(line)
            else:
                f_new.write(get_info_from_user() + '\n')
    os.remove('phones.txt')
    os.rename('phones_new.txt', 'phones.txt')
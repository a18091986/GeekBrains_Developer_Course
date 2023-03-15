import os

import numpy as np

from constants import error_string, menu_choice
from usefull_functions import my_print

# ------------------------------------------------------------------

task = f"Создать телефонный справочник с возможностью импорта и экспорта данных в формате .txt. \n" \
       f"Фамилия, имя, отчество, номер телефона - данные, которые должны находиться в файле.\n" \
       f"1. Программа должна выводить данные. \n" \
       f"2. Программа должна сохранять данные в текстовом файле \n" \
       f"3. Пользователь может ввести одну из характеристик для " \
       f"поиска определенной записи(Например имя или фамилию человека) \n" \
       f"4. Использование функций. Ваша программа не должна быть линейной \n" \
       f"5. Дополнить телефонный справочник возможностью изменения и удаления данных.\n" \
       f"Пользователь также может ввести имя или фамилию,\n" \
       f"и Вы должны реализовать функционал для изменения и удаления данных."

my_print(msg=task, separator_before=True)


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


def main_menu(operation: str):
    if operation == 'q':
        return 0
    elif operation == "1":
        add_info()
    elif operation == "2":
        for index, user in enumerate(find_info()):
            print(f'Найдено: {index}: {user}' if user else f"информации не найдено")
    elif operation == "3":
        change_info()
    else:
        return 3
    return 1


if __name__ == '__main__':
    answer = main_menu(input(menu_choice))
    while True:
        if not answer:
            break
        elif answer == 3:
            answer = main_menu(input(error_string))
        else:
            answer = main_menu(input(menu_choice))

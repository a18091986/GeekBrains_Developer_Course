from utils_for_phone_book import *
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

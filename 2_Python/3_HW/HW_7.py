from usefull_functions import my_print
from math import sqrt
import numpy as np

# ------------------------------------------------------------------
task = f"Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. \n" \
       f"Поскольку разобраться в его кричалках не настолько просто, насколько легко он их придумывает, \n" \
       f"Вам стоит написать программу. Винни-Пух считает, что ритм есть, если число слогов (т.е. число гласных букв) \n" \
       f"в каждой фразе стихотворения одинаковое. Фраза может состоять из одного слова, если во фразе несколько слов, \n" \
       f"то они разделяются дефисами. Фразы отделяются друг от друга пробелами. \n" \
       f"Стихотворение  Винни-Пух вбивает в программу с клавиатуры. В ответе напишите “Парам пам-пам”, \n" \
       f"если с ритмом все в порядке и “Пам парам”, если с ритмом все не в порядке"

my_print(msg=task, separator_before=True)

voewel_letters = ['о', 'а', 'у']
consonant_letters = ['ф', 'п', 'c']

rand_phrase = ' '.join([''.join(list(np.random.choice(voewel_letters + consonant_letters + ["-"],
                                                      np.random.randint(1, 10)))) for _ in range(10)])
right_phrase = "ап-па рпа-та фо-пу"

for phrase in [rand_phrase, right_phrase]:
    count_voewel_letters_list = list(map(lambda x: sum(1 if x[i] in voewel_letters else 0 for i in range(len(x))),
                                         phrase.split(' ')))
    my_print(f"Для фразы: {phrase}:\n"
             f"{(lambda x: 'Парам пам-пам' if len(set(x)) == 1 else 'Пам парам')(count_voewel_letters_list)}")

# ------------------------------------------------------------------
task = f"Напишите функцию print_operation_table(operation, num_rows=6, num_columns=6), \n" \
       f"которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру строки и столбца. \n" \
       f"Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны.\n" \
       f"Нумерация строк и столбцов идет с единицы (подумайте, почему не с нуля). \n" \
       f"Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, \n" \
       f"у операции умножения."

my_print(msg=task, separator_before=True)


def print_operation_table(operation, num_rows=6, num_columns=6):
    for i in range(1, num_columns + 1):
        for j in range(1, num_rows + 1):
            print(operation(i, j), end=' ')
        print()


for operation in [lambda x, y: x + y, lambda x, y: x * y, lambda x, y: x ** y]:
    print_operation_table(operation, 10, 10)
    print()

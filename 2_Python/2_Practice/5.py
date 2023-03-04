from usefull_functions import my_print
import numpy as np

# ------------------------------------------------------------------
task = f"Хакер Василий получил доступ к классному журналу и хочет заменить все свои минимальные оценки на \n" \
       f"максимальные. Напишите программу, которая заменяет оценки Василия, \n" \
       f"но наоборот: все максимальные – на минимальные."

my_print(msg=task, separator_before=True)


def change_marks(journal: list) -> list:
    min_mark = journal[0]
    max_mark = journal[0]
    for mark in journal:
        min_mark, max_mark = min(mark, min_mark), max(mark, max_mark)
    return [min_mark if mark == max_mark else mark for mark in journal]


journal_origin = list(np.random.randint(0, 5, 10))

my_print(f"Изначальные оценки: {journal_origin}\n"
         f"Итоговые оценки: {change_marks(journal_origin)}")

# ------------------------------------------------------------------
task = f"Последовательностью Фибоначчи называется последовательность чисел a0, a1, ..., an, ..., где \n" \
       f"a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1). Требуется найти N-е число Фибоначчи"

my_print(msg=task, separator_before=True)


def fibo_numbers(n) -> int:
    if n == 0:
        return 0
    if n == 1:
        return 1
    else:
        return fibo_numbers(n - 1) + fibo_numbers(n - 2)


n = np.random.randint(10)
my_print(msg=f"{n}-ое число Фибоначчи: {fibo_numbers(n)}", separator_before=False)

# ------------------------------------------------------------------
task = f"Напишите функцию, которая принимает на вход одно число и проверяет является ли оно простым"

my_print(msg=task, separator_before=True)


def is_simple_check(n) -> int:
    for i in range(2, n // 2 + 2):
        if n % i == 0:
            return True
    return False


n = np.random.randint(10)
my_print(msg=f"{n}: {'не простое' if is_simple_check(n) else 'простое'}", separator_before=False)

# ------------------------------------------------------------------
task = f"Дано натуральное число N и последовательность из N элементов, требуется вывести эту последовательность в" \
       f"обратном порядке. Запрещается объявлять массивы и использовать циклы"


def recursive_revert(N):
    if N == 0:
        return ''
    else:
        current_sym = input()
        # recursive_revert(N - 1)
        # print(current_sym)

        return f"{recursive_revert(N - 1)} {current_sym}"


my_print(msg=task, separator_before=True)

print(recursive_revert(int(input())))

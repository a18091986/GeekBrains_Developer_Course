from usefull_functions import my_print
from math import sqrt
import numpy as np

# ------------------------------------------------------------------
task = f"Заполните массив элементами арифметической прогрессии. Её первый элемент, разность и количество элементов \n" \
       f"нужно ввести с клавиатуры. Формула для получения n-го члена арифметической прогрессии: An = A1 + (n - 1) * d"

my_print(msg=task, separator_before=True)

def n_value_calcilate(a1: int, d: int, n: int) -> int:
    return a1 + (n - 1) * d

n, a1, d = np.random.randint(10, 100), np.random.randint(10, 20), np.random.randint(10, 15)

result = []
for i in range(n):
    result.append(n_value_calcilate(a1, d, i))

print(*result)

# ------------------------------------------------------------------
task = f"Определить индексы элементов массива (списка), значения которых приндлежат заданному диапазону \n" \
       f"(т.е. не меньше заданного минимума и не больше заданного максимума)"

my_print(msg=task, separator_before=True)
left = np.random.randint(0, 100)
right = np.random.randint(left, 200)
array = list(np.random.randint(left - 100, right + 100, 10))

my_print(msg=f"Диапазон: {left} - {right},\nсписок: {array},\n"
             f"индексы: {[i for i in range(len(array)) if left <= array[i] <= right]}")

from usefull_functions import my_print
from math import sqrt
import numpy as np

# ------------------------------------------------------------------
task = f"Даны два массива чисел. Требуется вывести те элементы первого массива (в том порядке, в котором они идут\n" \
       f"в первом массиве), которых нет во втором массиве. Пользователь вводит число N - число элементов в первом \n" \
       f"массиве, сами элементы, M - число элементов во втором массиве, сами элементы."

my_print(msg=task, separator_before=True)

# arr1, arr2 = [int(input()) for _ in range(int(input()))], [int(input()) for _ in range(int(input()))]
# arr_1_set, arr_2_set = set(arr1), set(arr2)
# arr1_difference_arr_2 = arr_1_set.difference(arr_2_set)
# print(*[el for el in arr1 if el in arr1_difference_arr_2])


# ------------------------------------------------------------------
task = f"Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит количество\n" \
       f"элементов, у которых два соседних и при этом оба соседа меньше данного. Сначала вводится число N - \n" \
       f"количество элементов в массиве. Далее вводятся сами элементы массива. Массив из целых чисел"

my_print(msg=task, separator_before=True)
# arr1 = [int(x) for x in input().split()]
# print(len([arr1[index] for index in range(1, len(arr1) - 1) if
#            (arr1[index-1] < arr1[index] and arr1[index+1] < arr1[index])]))


# ------------------------------------------------------------------
task = f"Дан список чисел. Требуется посчитать сколько в нем пар элементов, равных друг другу. Считается, что любые\n" \
       f"два элемента, равные друг другу образуют одну пару, которую необходимо посчитать. Вводится список чисел. "

my_print(msg=task, separator_before=True)

# arr1 = [int(x) for x in input().split()]
# count = 0
# for index, el in enumerate(arr1):
#     count += arr1[index+1:].count(el)
# print(count)


# ------------------------------------------------------------------
task = f"Два различных натуральных числа считаются дружественными, если сумма делителей n (включая n но исключая 1) \n" \
       f"равна числу m и наоборот. 220 и 284 - дружественные. По заданному числу k найти все пары дружественных чисел,\n" \
       f"каждое из которых не превышает k. Программа на вход получает число k не превышающее 1Е5. Должна вывести\n" \
       f"все пары дружественных чисел, каждое из которых не превосходит k. Пары необходимо выводить по одной в строке,\n" \
       f"разделяя пробелами. Каждая пара должна быть выведена только 1 раз (перестановка чисел новую пару не дает)"

my_print(msg=task, separator_before=True)
limit = int(1E4)

# ------------------1 вариант-------------------------------------------
my_print(msg='Первый вариант: ', color='синий')
pairs = {}


def divisors_sum(number):
    lst = []
    for x in range(1, int(sqrt(number)) + 1):
        if number % x == 0:
            if (number or x) != number // x:
                lst.append(x)
                lst.append(number // x)
            else:
                lst.append(1)
    return sum(lst)


for i in range(1, limit + 1):
    aggr = divisors_sum(i)
    if i == divisors_sum(aggr) and i != aggr:
        if i not in pairs:
            if i not in pairs.values():
                pairs[i] = aggr

print(pairs)

# ------------------2 вариант-------------------------------------------
my_print(msg='Второй вариант: ', color='синий')


def func(number):
    def friendly_numbers(num):
        lst = []
        for i in range(1, num // 2 + 1):
            if num % i == 0:
                lst.append(i)
        return sum(lst)

    num_1 = friendly_numbers(number)
    num_2 = friendly_numbers(num_1)
    if num_2 == number and num_1 != num_2:
        print(number, ':', num_1, end=' ')


for i in range(1, limit):
    func(i)

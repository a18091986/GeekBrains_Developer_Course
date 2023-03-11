# list compehensions
import string

print(*[i if i % 2 == 0 else 0 for i in range(10)])
# enumerate
print(*[(j, i) if i % 2 == 0 else (j, 0) for j, i in enumerate(range(10))])
# lambda
print((lambda x, y: x + y)(1, 2))
# map
a = '1, 2, 3, 400'
a_list = list(map(float, [x.strip() for x in a.split(",")]))
print(*a_list)
# filter
print(*list(filter(lambda x: x % 3 == 0 if x < 10 else 100, a_list)))
# zip
a = [1, 2, 3, 4]
b = "abcdef"
d = {1: "test", 2: "manifest", 3: "rest", 4: "fest"}
print(*list(zip(a, b, d.values())))
print(dict(zip(a, b)))

from usefull_functions import my_print
from math import sqrt
import numpy as np

# ------------------------------------------------------------------
task = f"Задан список values (например values=[3,4,5,6,7])\n" \
       f"transformed_values=list(map(transformation, values))\n" \
       f"Задать функцию transformation, чтобы transformed_values получился копией values"

my_print(msg=task, separator_before=True)

values = np.random.randint(1, 100, 10)
transformation = lambda x: x
my_print(msg=f"Исходный список: {values}\n"
             f"Трансформированный список: {list(map(transformation, values))}")

# ------------------------------------------------------------------
task = f"Планеты вращаются вокруг звезд по эллиптическим орбитам. Назовем самой далекой планетой ту, орбита которой\n" \
       f"имеет самую большую площадь. Напишите функцию find_farthest_orbit(list_of_orbits, которая среди списка орбит\n" \
       f"найдёт ту, по которой вращается самая далекая планета. Круговые орбиты не учитывать. Результатом работы\n" \
       f"функции должен быть кортеж, содержащий длины полуосей эллипса орбиты самой далекой планеты. Площадь эллипса: \n" \
       f"S = pi * a * b"

my_print(msg=task, separator_before=True)

orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]

out = list(filter(lambda x: x[1] != x[2], map(lambda x: (3.14 * x[0] * x[1], x[0], x[1]), orbits)))
print(out)
out.sort(key=lambda x: x[0])
print(out[-1][1], out[-1][2])

# ------------------------------------------------------------------
task = f"Напишите функцию same_by(characteristic, objects), которая проверяет все ли объекты имеют одинаковое значение\n" \
       f"некоторой характеристики и возвращают True, если это так. Если значение характеристики для разных объектов\n" \
       f"отличается, то False. Для пустого набора объектов функция должна возвращать True.\n" \
       f"Аргумент characteristic - функция, которая принимает объект и вычисляет его характеристику"

my_print(msg=task, separator_before=True)

func = lambda x: x % 2 == 0

l1 = []
l2 = [1, 2, 3]
l3 = [2, 4, 6]


def same_by(func, vals):
    # return sum(map(func, vals)) / len(vals) == 1 if len(vals) != 0 else True
    return all(map(func, vals))


for list_ in [l1, l2, l3]:
    print(same_by(func, list_))

# ------------------------------------------------------------------
task = f"Напишите программу на python для поиска пересечения двух заданных массивов с помощью lambda, filter"

my_print(msg=task, separator_before=True)

arr_1 = [1, 2, 3, 4]
arr_2 = [2, 4, 5, 6]

print(*list(filter(lambda x: x in arr_2, arr_1)))

# ------------------------------------------------------------------
task = f"Имеется упорядоченный список, перебрать элементы этого списка с помощью enumerate и элементы, стоящие\n" \
       f"на главной диагонали (имеющие равные индексы со списком и индексом элемента внутри списка), превратить в нули"

my_print(msg=task, separator_before=True)

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

print([[x[j] if j != i else 0 for j in range(len(x))] for i, x in enumerate(a)])

# ------------------------------------------------------------------
task = f"Имеется список id сотрудников из 10 элементов, каждый id - случайное число от 1 до 100 (сделать с list compr)\n" \
       f"Имеется список имен сотрудников из 10 элементов (вручную)\n" \
       f"1. Сопоставьте каждому имени сотрудника его id по порядку и выведите получившийся список кортежей\n" \
       f"2. Отсортируйте список по возрастанию id\n" \
       f"3. Выведите имена сотрудников, получившие нечетное id"

my_print(msg=task, separator_before=True)

ids = [x for x in np.random.randint(1, 101, 10)]
names = [np.random.choice(list(string.ascii_lowercase)) for _ in range(10)]

first_list = list(zip(ids, names))
# second_list = first_list.sort(key=lambda x: x[0])
second_list = sorted(first_list, key=lambda x: x[0])
third_list = list(filter(lambda x: x[0] % 2 != 0, second_list))

my_print(msg=f"ids: {ids}\n"
             f"names: {names}\n"
             f"1. {first_list}\n"
             f"2. {second_list}\n"
             f"3. {third_list}", color="синий")


# ------------------------------------------------------------------
task = f"Напишите программу, которая с помощью функций filter() и map() отбирает из заданного списка numbers \n" \
       f"трёхзначные числа, дающие при делении на 55 остаток 22, и выводит их кубы, каждый в отдельной строке."

my_print(msg=task, separator_before=True)

l = [1, 2, 3, 22 + 55 * 10, 1235, 22 + 55 * 20, 22 + 55 * 5, 22 + 55]
print(l)
print(*list(map(lambda x: x*x*x, filter(lambda x: len(str(x)) == 3 and x % 55 == 22, l))), sep='\n')






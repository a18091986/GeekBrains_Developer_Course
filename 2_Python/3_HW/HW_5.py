from usefull_functions import my_print
import numpy as np

# ------------------------------------------------------------------
task = f"Напишите программу, которая на вход принимает два числа A и B, \n" \
       f"и возводит число А в целую степень B с помощью рекурсии."

my_print(msg=task, separator_before=True)


def recursive_pow(a: int, b: int, result=1) -> int:
    if a == 0:
        return a
    if b == 0:
        return result
    else:
        result *= a
        return recursive_pow(a, b - 1, result=result)


a = np.random.randint(0, 10)
b = np.random.randint(0, 4)

my_print(f"a = {a}, b = {b}, a**b = {recursive_pow(a, b)}")

# ------------------------------------------------------------------
task = f"Напишите рекурсивную функцию sum(a, b), возвращающую сумму двух целых неотрицательных чисел. \n" \
       f"Из всех арифметических операций допускаются только +1 и -1. Также нельзя использовать циклы."

my_print(msg=task, separator_before=True)


def recursive_sum(a, b):
    if b == 0:
        return a
    else:
        if b < 0:
            a -= 1
            return recursive_sum(a, b + 1)
        else:
            a += 1
            return recursive_sum(a, b - 1)


a = np.random.randint(-10, 10)
b = np.random.randint(-10, 10)

my_print(f"a = {a}, b = {b}, a+b = {recursive_sum(a, b)}")

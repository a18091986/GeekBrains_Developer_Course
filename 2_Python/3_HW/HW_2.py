import random
from usefull_functions import print_separator_text


# ----------------------------------------------------------------------------------
def coins_min_revert_count(coins_state: list) -> int:
    count = 0
    for i in range(len(coins_state)):
        if coins_state[i] == 0:
            count += 1
    return min(len(coins_state) - count, count)


print_separator_text("*", "На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. \n"
                          "Определите минимальное число монеток, которые нужно перевернуть, \n"
                          "чтобы все монетки были повернуты вверх одной и той же стороной. \n"
                          "Выведите минимальное количество монет, которые нужно перевернуть")
coins_count = random.randint(1, 100)
coins_state = random.sample([0, 1] * coins_count, coins_count)
print(f"На столе {coins_count} монетки.\n"
      f"Из них решкой вверх: {sum(coins_state)}. Решкой вниз: {len(coins_state) - sum(coins_state)}\n"
      f"Состояние монеток: {coins_state}\n"
      f"Минимальное число монеток, которые нужно перевернуть: {coins_min_revert_count(coins_state)}")

# ----------------------------------------------------------------------------------

def guess_numbers(sum_s: int, mult_p: int) -> (int, int, int):
    iter_num, x = 0, 0
    while x <= 1000:
        y = 0
        iter_num += 1
        while y <= 1000:
            iter_num += 1
            if x + y == sum_s and x * y == mult_p:
                return x, y, iter_num
            else:
                y += 1
        x += 1


print_separator_text("*", f"Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. \n"
                          f"Петя помогает Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000),\n"
                          f"а Катя должна их отгадать. Для этого Петя делает две подсказки. \n"
                          f"Он называет сумму этих чисел S и их произведение P. \n"
                          f"Помогите Кате отгадать задуманные Петей числа.")

number_for_guess_1, number_for_guess_2 = random.randint(1, 1001), random.randint(1, 1001)

guessed_1, guessed_2, iter_num = \
    guess_numbers(number_for_guess_1 + number_for_guess_2, number_for_guess_1 * number_for_guess_2)

print(f"Петя загадал: {number_for_guess_1} и {number_for_guess_2}\n"
      f"Катя угадала: {guessed_1} и {guessed_2}. Настолько Катя заколебалась (номер попытки): {iter_num}")


# ----------------------------------------------------------------------------------
def power_of_two_smaller_than_number(number: str) -> None:
    x = 0
    while 2**x < number:
        print(f"Степень двойки: {x}, 2^{x} = {2 ** x}")
        x += 1


print_separator_text("*", f" Требуется вывести все целые степени двойки "
                          f"(т.е. числа вида 2k), не превосходящие числа N.")

n = random.randint(1, 100000)
print(f"Сгенерированное число: {n}")
power_of_two_smaller_than_number(n)

from usefull_functions import my_print

# ------------------------------------------------------------------
task = f"Напишите программу, которая принимает на вход строку, и отслеживает, \n" \
       f"сколько раз каждый символ уже встречался. Количество повторов добавляется к символам \n" \
       f"с помощью постфикса формата _n."

# my_print(msg=task, separator_before=True)
# out_list = []
# for sym in input().split():
#     if sym in out_list:
#         out_list.append(f"{sym}")
#         out_list.append(f"_{out_list.count(sym) - 1}")
#     else:
#         out_list.append(sym)
# print(" ".join(out_list).replace(' _', '_'))

# ------------------------------------------------------------------
task = f"Пользователь вводит текст(строка). Словом считается последовательность непробельных символов \n" \
       f"идущих подряд, слова разделены одним или большим числом пробелов. Определите, \n" \
       f"сколько различных слов содержится в этом тексте"

# my_print(msg=task, separator_before=True)
# print(len(set(input().lower().split())))

# ------------------------------------------------------------------
task = f"Задана последовательность неотрицательных целых чисел. \n" \
       f"Требуется определить значение наибольшего элемента последовательности, \n" \
       f"которая завершается первым встретившимся нулем (число 0 не входит в последовательность)"

my_print(msg=task, separator_before=True)
max_digit = -1
while True:
    current_digit = int(input())
    if current_digit:
        if max_digit < current_digit:
            max_digit = current_digit
    else:
        break
print(max_digit)

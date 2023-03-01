from usefull_functions import my_print

# ------------------------------------------------------------------
task = f"Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в \n" \
       f"порядке возрастания все те числа, которые встречаются в обоих наборах. Пользователь вводит 2 числа. \n" \
       f"n - кол-во элементов первого множества. m - кол-во элементов второго множества.\n" \
       f"Затем пользователь вводит сами элементы множеств."

my_print(msg=task, separator_before=True)
n = int(input())
m = int(input())
set_1, set_2 = {input() for _ in range(n)}, {input() for _ in range(m)}
out_set = set_1.intersection(set_2)
print(" ".join(sorted(list(out_set))))

# ------------------------------------------------------------------
task = f"В фермерском хозяйстве в Карелии выращивают чернику. Она растет на круглой грядке, причем кусты высажены \n" \
       f"только по окружности. Таким образом, у каждого куста есть ровно два соседних. \n" \
       f"Всего на грядке растет N кустов Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них \n" \
       f"выросло различное число ягод – на i-ом кусте выросло ai ягод. В этом фермерском хозяйстве внедрена система \n" \
       f"автоматического сбора черники. Эта система состоит из управляющего модуля и нескольких собирающих модулей. \n" \
       f"Собирающий модуль за один заход, находясь непосредственно перед некоторым кустом, собирает ягоды\n" \
       f"с этого куста и с двух соседних с ним. \n" \
       f"Напишите программу для нахождения максимального числа ягод, которое может собрать за один заход\n" \
       f"собирающий модуль, находясь перед некоторым кустом заданной во входном файле грядки."

my_print(msg=task, separator_before=True)
n = int(input("Введи количество кустов: "))
ber_lst = [int(x) for x in input("Введи количество ягод на каждом кусте разделяя пробелом: ").split()]
ber_lst.insert(0, ber_lst[-1])
ber_lst.append(ber_lst[1])
max_ber = 0
for i in range(1, len(ber_lst) - 1):
    max_ber = max(sum([ber_lst[i - 1], ber_lst[i], ber_lst[i + 1]]), max_ber)
print(max_ber)

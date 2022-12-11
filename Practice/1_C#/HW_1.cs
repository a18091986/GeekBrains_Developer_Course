// ------------ Задача 1: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее. ----------

// Console.Write("Input first number: ");
// int f_num = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input second number: ");
// int s_num = Convert.ToInt32(Console.ReadLine());
// if (f_num >= s_num)
//     Console.WriteLine($"max = {f_num}");
// else 
//     Console.WriteLine($"max = {s_num}");

// Тесты: 
// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3

// ---------- Задача 2: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.----------

// Console.Write("Input first number ");
// int f = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input second number ");
// int s = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input third number ");
// int t = Convert.ToInt32(Console.ReadLine());

// if (f >= s) {
//     if (f >= t) 
//         Console.WriteLine($"max = {f}");
//     else 
//         Console.WriteLine($"max = {t}");
// }
// else {
//     if (s >= t) 
//         Console.WriteLine($"max = {s}");
//     else 
//         Console.WriteLine($"max = {t}");
// }


// Тесты: 
// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22

// ---------- Задача 3: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка). ----------

// Console.Write("Input number: ");
// if ((Convert.ToInt32(Console.ReadLine()) % 2) == 0)
//     Console.WriteLine("Да");
// else 
//     Console.WriteLine("Нет");

// Тесты: 
// 4 -> да
// -3 -> нет
// 7 -> нет

// ---------- Задача 4: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N. ----------

// int counter = 2, N;
// Console.Write("Input Range Upper Limit: ");
// N = Convert.ToInt32(Console.ReadLine());
// while (counter <= N) {
//     if (counter % 2 == 0)
//         Console.Write($"{counter} ");
//     counter++;
// }

// Тесты: 
// 5 -> 2, 4`
// 8 -> 2, 4, 6, 8
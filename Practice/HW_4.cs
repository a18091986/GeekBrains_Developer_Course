// Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

// int pow(int A, int B) {
//     int result = A;
//     for (int i = 2; i <= B; i++)
//         result*=A;
//     return result;
// }

// Console.Write("Input A: ");
// int A = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input B: ");
// int B = Convert.ToInt32(Console.ReadLine());
// int pow_A_B = pow(A, B);
// Console.WriteLine($"Число {A} в степени {B} самописным методом: {pow_A_B}");
// Console.WriteLine($"Число {A} в степени {B} встроенными средствами: {Math.Pow(A, B)}");


// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16


// Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

// int sum_digits (int digit) {
//     int sum = 0;
//     while (digit >= 1) {
//         sum += digit % 10;
//         digit /= 10;
//     }
//     return sum;
// }

// Console.Write("Input Number: ");
// Console.WriteLine(sum_digits(Convert.ToInt32(Console.ReadLine())));

// 452 -> 11
// 82 -> 10
// 9012 -> 12



// Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.

// int[] InputArray(int len_array) {
//     int[] array = new int[len_array];
//     for (int i = 0; i < len_array; i++) {
//         Console.Write($"Введите {i} элемент массива: ");
//         array[i] = Convert.ToInt32(Console.ReadLine());
//     }
//     return array;
// }

// void PrintArray(int[] array) {
//     for (int i = 0; i < array.Length; i++)
//         Console.WriteLine($"{i}-й элемент массива: {array[i]}");
// }

// Console.Write("Input array size: ");
// PrintArray(InputArray(Convert.ToInt32(Console.ReadLine())));

// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 6, 1, 33 -> [6, 1, 33]
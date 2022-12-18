// // Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

// Console.Write("Count of input numbers: ");
// int M = Convert.ToInt32(Console.ReadLine());
// int count = 0;
// for (int i = 0; i < M; i++) {
//     Console.Write("Input Number: ");
//     if (Convert.ToDouble(Console.ReadLine()) > 0)
//         count++;
// }

// Console.WriteLine($"Введено {count} положительных");

// // 0, 7, 8, -2, -2 -> 2
// // 1, -7, 567, 89, 223-> 3

// // Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.


// void ReadInfoAboutLine(string line_title, double [] arr) {
//     Console.WriteLine($"{line_title} прямая: ");
//     Console.Write($"b: ");
//     arr[0] = Convert.ToDouble(Console.ReadLine());
//     Console.Write($"k: ");
//     arr[1] = Convert.ToDouble(Console.ReadLine());
//     Console.WriteLine($"{line_title} прямая: y = {arr[1]}*x + {arr[0]}");
// }

// void Intersect(double [] arr_1, double [] arr_2) {
//     if (arr_1[1] == arr_2[1])
//         if (arr_1[0] != arr_2[0])
//             Console.WriteLine("Прямые параллельны");
//         else
//             Console.WriteLine("Прямые cовпадают");
//     else
//         Console.WriteLine($"Координаты точки пересечения: ({(arr_2[0] - arr_1[0]) / (arr_1[1] - arr_2[1])}; {(arr_1[1] * arr_2[0] - arr_1[0] * arr_2[1]) / (arr_1[1] - arr_2[1])}) ");
// }

// double [] b1_k1 = new double[2];
// ReadInfoAboutLine("первая", b1_k1);
// double [] b2_k2 = new double[2];
// ReadInfoAboutLine("вторая", b2_k2);
// Intersect(b1_k1, b2_k2);

// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)



// // Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.

// void PrintDigitsrecursive(int N) {
//     if (N >= 1) {
//         Console.Write($"{N} ");
//         PrintDigitsrecursive(N-1);
//     }
// }

// // Console.WriteLine("Input N: ");
// // int N = Convert.ToInt32(Console.ReadLine());
// // PrintDigitsrecursive(N);

// // N = 5 -> "5, 4, 3, 2, 1"
// // N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

// // Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

// int RecursiveSum(int N, int M) {
//     int min = (M <= N) ? M : N;
//     int max = (M <= N) ? N : M;
//     if (min < max) {
//         return min + RecursiveSum(min+1, max);
//     } else {
//         return max;
//     }
// }

// // Console.Write("Input N: ");
// // int N = Convert.ToInt32(Console.ReadLine());
// // Console.Write("Input M: ");
// // int M = Convert.ToInt32(Console.ReadLine());
// // int sum = RecursiveSum(M, N);
// // Console.WriteLine($"Sum: {sum}");

// // M = 1; N = 15 -> 120
// // M = 4; N = 8. -> 30

// // Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.

// int Accerman(int m, int n) {
//     if (m == 0)
//         return n + 1;
//     else {
//         if ((m != 0) && (n == 0))
//             return Accerman(m - 1, 1);
//     else
//       return Accerman(m - 1, Accerman(m, n - 1));
//     }
// }

// Console.Write("Input m: ");
// int m = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input n: ");
// int n = Convert.ToInt32(Console.ReadLine());
// int accerman = Accerman(m, n);
// Console.WriteLine($"Result: {accerman}");

// // m = 2, n = 3 -> A(m,n) = 9
// // m = 3, n = 2 -> A(m,n) = 29
// ---------------------------------------------Task_1-----------------------------------------------
// Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от 1 до N.

// void DigitsRangePrint(int N) {
//     if (N > 1) DigitsRangePrint(N - 1);
//     Console.Write($"{N} ");
// }

// void DigitsRangePrintReverse(int N) {
//     Console.Write($"{N} ");
//     if (N > 1) {
//         DigitsRangePrintReverse(N - 1);
//     }
// }

// Console.Write("Input N: ");
// int N = Convert.ToInt32(Console.ReadLine());
// DigitsRangePrint(N);
// Console.WriteLine();
// DigitsRangePrintReverse(N);

// ---------------------------------------------Task_2-----------------------------------------------
// Найдите сумму цифр числа

// int GetSumOfDigits(int num) {
//     if (num != 0) {
//         return GetSumOfDigits(num / 10) + num % 10;
//     }
//     return 0;
// }

// Console.Write(GetSumOfDigits(1342));


// ---------------------------------------------Task_3-----------------------------------------------
// Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N.

// void DigitsRangePrintMN(int M, int N) {
//     int min = (M < N) ? M : N;
//     int max = (M < N) ? N : M;
//     if (min < max) {
//         Console.Write($"{min} ");
//         DigitsRangePrintMN(min + 1, max);
//     } else {
//         Console.Write($"{max} ");
//     }
// }

// Console.Write("Input M: ");
// int M = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input N: ");
// int N = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine();
// DigitsRangePrintMN(M, N);




// ---------------------------------------------Task_4-----------------------------------------------
// Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B.


// double ApowB(int a, int b) {

//     if (b >= 1) 
//         return a * ApowB(a, b - 1);
//     else if (b <= -1)
//         return (1.0 / a) * ApowB(a, b + 1);
//     else
//         return 1;
// }

// Console.Write("Input a: ");
// int a = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input b: ");
// int b = Convert.ToInt32(Console.ReadLine());

// Console.WriteLine(ApowB(a, b));




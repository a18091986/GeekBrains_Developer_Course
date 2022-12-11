// -----------------------------------TASK_1-----------------------------------------------------
// Напишите программу, которая принимает на вход число (А) и выдаёт сумму чисел от 1 до А.

// int RangeSum(int A) {
//     int sum = 0;
//     for (int i = 1; i <= A; i++) 
//         sum += i;
//     return sum;
// }

// Console.Write("Input A: ");
// Console.WriteLine($"Искомая сумма: {RangeSum(Convert.ToInt32(Console.ReadLine()))}");

// -----------------------------------TASK_2-----------------------------------------------------
// Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.

// int LenNumber(int digit) {
//     int counter = 1;
//     while (Math.Abs(digit / 10) >= 1) {
//         counter++;
//         digit /= 10;
//     }
//     return counter;
// }

// Console.Write("Input digit: ");
// Console.WriteLine(LenNumber(Convert.ToInt32(Console.ReadLine())));

// -----------------------------------TASK_3-----------------------------------------------------
// Напишите программу, которая принимает на вход число N и выдаёт произведение чисел от 1 до N.

// int factorial(int N) {
//     int fact = 1;
//     for (int i = 1; i <= N; i++)
//         fact *= i;
//     return fact;
// }

// Console.Write("Input digit: ");
// Console.WriteLine(factorial(Convert.ToInt32(Console.ReadLine())));

// ----------------------------------------------------------------------------------------------
// -----------------------------------Массивы----------------------------------------------------
// ----------------------------------------------------------------------------------------------

// int[] CreateRandomArray(int len_array, int range_left, int range_right) {
//     int [] array = new int[len_array]; // эта запись выделяет память под массив и заполняет его нулями
//     for (int i = 0; i < len_array; i++) 
//         array[i] = new Random().Next(range_left, range_right + 1);
//     return array;
// }

// void PrintArray(int[] array) {
//     for (int i = 0; i < array.Length; i++)
//         Console.WriteLine($"{i} элемент массива: {array[i]};");
// }

// Console.Write("Задайте длину массива: ");
// int len_array = Convert.ToInt32(Console.ReadLine());
// Console.Write("Задайте нижнюю границу: ");
// int range_left = Convert.ToInt32(Console.ReadLine());
// Console.Write("Задайте верхнюю границу: ");
// int range_right = Convert.ToInt32(Console.ReadLine());
// int[] array = CreateRandomArray(len_array, range_left, range_right);
// PrintArray(array);
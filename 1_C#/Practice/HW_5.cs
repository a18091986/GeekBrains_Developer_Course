// int[] GenerateRandomIntArray(int arr_size, int min_val, int max_val) {
//     int[] array = new int[arr_size];

//     for (int i = 0; i < arr_size; i++)
//         array[i] = new Random().Next(min_val, max_val + 1);
    
//     return array;
// }

// double[] GenerateRandomDoubleArray(int arr_size, double min_val, double max_val) {
//     double [] array = new double[arr_size];

//     for (int i = 0; i < arr_size; i++)
//         array[i] = new Random().NextDouble() * (max_val - min_val) + min_val;
    
//     return array;
// }

// void PrintIntArray(int[] arr) {
//     for (int i = 0; i < arr.Length; i++)
//         Console.Write($"{arr[i]} ");
// }

// void PrintDoubleArray(double[] arr) {
//     for (int i = 0; i < arr.Length; i++)
//         Console.Write($"{Math.Round(arr[i], 2)} ");
// }

// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.

// int CountEvenNumbersInArray(int[] arr) {
//     int count = 0;
//     for (int i = 0; i < arr.Length; i++)
//         if (arr[i] % 2 == 0)
//             count++;

//     return count;
// }

// int[] arr = GenerateRandomIntArray(arr_size: 10, min_val: 100, max_val: 999);
// PrintIntArray(arr);
// Console.WriteLine();
// Console.WriteLine($"Count of even numbers in array: {CountEvenNumbersInArray(arr)}");


// [345, 897, 568, 234] -> 2

// Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

// int SumOddIndexNumbersInArray(int[] arr) {
//     int sum = 0;
//     for (int i = 1; i < arr.Length; i+=2)
//         sum+=arr[i];

//     return sum;
// }

// int[] arr = GenerateRandomIntArray(arr_size: 10, min_val: 1, max_val: 10);
// PrintIntArray(arr);
// Console.WriteLine();
// Console.WriteLine($"Sum of numbers on odd position in array: {SumOddIndexNumbersInArray(arr)}");

// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

// Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

// double DifferenceBetweenMaxAndMin(double[] arr) {
//     double min = arr[0];
//     double max = arr[0];
//     for (int i = 1; i < arr.Length; i++) {
//         if (arr[i] < min)
//             min = arr[i];
//         if (arr[i] > max)
//             max = arr[i];
//     }
//     return max - min;
// }

// double[] arr = GenerateRandomDoubleArray(arr_size: 10, min_val: 1.0, max_val: 10.0);
// PrintDoubleArray(arr);
// Console.WriteLine();
// Console.WriteLine($"Difference between max and min elements of array: {Math.Round(DifferenceBetweenMaxAndMin(arr), 2)}");

// [3 7 22 2 78] -> 76
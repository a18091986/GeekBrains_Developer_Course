// -----------------------task_1---------------------------------
// Просуммировать все отрицательные элементы массива

// int[] GenerateRandomArray(int arr_size, int min_val, int max_val) {
//     int[] array = new int[arr_size];

//     for (int i = 0; i < arr_size; i++)
//         array[i] = new Random().Next(min_val, max_val + 1);
    
//     return array;
// }

// void PrintArray(int[] arr) {
//     for (int i = 0; i < arr.Length; i++)
//         Console.Write($"{arr[i]} ");
// }


// int FindSumNegativeElements(int[] arr) {
//     int sum = 0;
//     for (int i = 0; i < arr.Length; i++)
//         if (arr[i] < 0)
//             sum += arr[i];

//     return sum;
// }

// int[] ReplacePositiveAndNegative(int[] arr) {
//     for (int i = 0; i < arr.Length; i++)
//         arr[i] *= -1;
//     return arr;
// }

// bool IsElementInArray(int[] arr, int element_to_find) {
//     bool result = false;
//     for (int i = 0; i < arr.Length; i++)
//         if (arr[i] == element_to_find) {
//             result = true;
//             break;
//         }
            
//     return result; 
// }

// int CountElementsOfMassiveInRange(int[] arr, int min_val, int max_val) {
//     int count = 0;
//     for (int i = 0; i < arr.Length; i++)
//         if (arr[i] >= min_val && arr[i] <= max_val)
//             count += 1;
//     return count;
// }

// int[] arr = GenerateRandomArray(arr_size: 10, min_val: -1, max_val: 10);
// PrintArray(arr);
// Console.WriteLine();
// Console.WriteLine($"Sum of nefative elements of array: {FindSumNegativeElements(arr)}");

// -----------------------task_2---------------------------------
// Напишите программу замены элементов массива: положительные элементы 
// замените на соответствующие отрицательные, и наоборот.

// int[] arr = GenerateRandomArray(arr_size: 10, min_val: -10, max_val: 11);
// PrintArray(arr);
// Console.WriteLine();
// arr = ReplacePositiveAndNegative(arr);
// PrintArray(arr);

// -----------------------task_3---------------------------------
// Задайте массив. Напишите программу, которая определяет, 
// присутствует ли заданное число в массиве.

// int[] arr = GenerateRandomArray(10, 0, 11);
// PrintArray(arr);
// Console.WriteLine();
// Console.WriteLine("Введи элемент для проверки его наличия в массиве: ");
// int element_to_find = Convert.ToInt32(Console.ReadLine());
// string answer = (IsElementInArray(arr, 5)) ? "Element in array":"Element not in array";
// Console.WriteLine(answer);

// -----------------------task_4---------------------------------
// Задайте массив из m случайных чисел. Найдите количество элементов массива, 
// значения которых лежат в отрезке [a,b].

// int[] arr = GenerateRandomArray(10, -10, 10);
// PrintArray(arr);
// Console.WriteLine();
// Console.WriteLine(CountElementsOfMassiveInRange(arr, -10, 10));
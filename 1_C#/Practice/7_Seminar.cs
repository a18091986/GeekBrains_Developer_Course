// // ----------------------------------------Task_1----------------------------------------

// // Задайте двумерный массив размером m×n, заполненный случайными целыми числами

// int [,] GenerateRandom2DArray() {
//     Console.Write("Input number of rows: ");
//     int rows = Convert.ToInt32(Console.ReadLine());
//     Console.Write("Input number of columns: ");
//     int cols = Convert.ToInt32(Console.ReadLine());
//     Console.Write("Input min value: ");
//     int minValue = Convert.ToInt32(Console.ReadLine());
//     Console.Write("Input max value: ");
//     int maxValue = Convert.ToInt32(Console.ReadLine());
//     int [,] array = new int[rows, cols];
//     for (int i = 0; i < rows; i++) {
//         for (int j = 0; j < cols; j++) {
//             array[i,j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return array;
// }

// void Show2DArray(int[,] array) {
//     for (int i = 0; i < array.GetLength(0); i++) {
//         for (int j = 0; j < array.GetLength(1); j++) {
//             Console.Write(array[i,j] + "\t");
//         }
//         Console.WriteLine();
//     }
//     Console.WriteLine();
// }

// int[,] myArray = GenerateRandom2DArray();
// Show2DArray(myArray);

// // ----------------------------------------Task_2----------------------------------------
// Задайте двумерный массив размера m на n, каждый элемент в массиве находится по формуле: Aij = i+j. Выведите полученный массив на экран.

// int [,] Generate2DArray() {
//     Console.Write("Input number of rows: ");
//     int rows = Convert.ToInt32(Console.ReadLine());
//     Console.Write("Input number of columns: ");
//     int cols = Convert.ToInt32(Console.ReadLine());
//     int [,] array = new int[rows, cols];
//     for (int i = 0; i < rows; i++) {
//         for (int j = 0; j < cols; j++) {
//             array[i,j] = i + j;
//         }
//     }
//     return array;
// }

// int[,] myArray = Generate2DArray();
// Show2DArray(myArray);

// ----------------------------------------Task_3----------------------------------------
// Задайте двумерный массив. Найдите элементы, у которых оба индекса чётные, и замените эти элементы на их квадраты.

// void ReplaceElementsIn2DArray(int[,] array) {

//     for (int i = 0; i < array.GetLength(0); i+=2) {
//         for (int j = 0; j < array.GetLength(1); j+=2) {
//             array[i,j] = array[i,j]*array[i,j];
//         }
//     }
// }

// // ReplaceElementsIn2DArray(myArray);
// // Show2DArray(myArray);

// // Задайте двумерный массив. Найдите сумму элементов, находящихся на главной диагонали (с индексами (0,0); (1;1) и т.д.

// int SumElementsOnMainDiag2DArray(int[,] array) {
//     int sum = 0;
//     int min_dimension = (array.GetLength(0) <= array.GetLength(1)) ? array.GetLength(0) : array.GetLength(1); 
//     for (int i = 0; i < min_dimension; i++) {
//         sum+=array[i,i];
//     }
//     return sum;
// }

// SumElementsOnMainDiag2DArray(myArray);
// Console.WriteLine($"Sum: {SumElementsOnMainDiag2DArray(myArray)}");
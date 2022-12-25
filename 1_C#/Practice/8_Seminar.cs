// int[,] GenerateRandom2DArray() {
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
//     Console.WriteLine();
//     for (int i = 0; i < array.GetLength(0); i++) {
//         for (int j = 0; j < array.GetLength(1); j++) {
//             Console.Write(array[i,j] + "\t");
//         }
//         Console.WriteLine();
//     }
//     Console.WriteLine();
// }

// // ----------------------------------------Task_1----------------------------------------
// // Задайте двумерный массив. Напишите программу, которая заменяет строки на столбцы. В случае, если это невозможно, программа должна вывести сообщение для пользователя.

// void TransposeMatrix(int[,] array) {
//     if (array.GetLength(0) == array.GetLength(1)) 
//         for (int i = 0; i < array.GetLength(0) - 1; i++)
//             for (int j = i + 1; j < array.GetLength(1); j++) {
//                 int temp = array[i,j];
//                 array[i,j] = array[j,i];
//                 array[j,i] = temp;
//             }
//     else Console.WriteLine("Transposition is impossible!");
// }

// // int[,] myArray = GenerateRandom2DArray();
// // Show2DArray(myArray);
// // TransposeMatrix(myArray);
// // Show2DArray(myArray);

// // ----------------------------------------Task_2----------------------------------------
// // Задайте двумерный массив. Напишите программу, которая поменяет местами строки, которые задаст пользователь

// void ChangeRowsPlaces(int[,] array, int row_index_1, int row_index_2) {
//     if (row_index_1 < array.GetLength(0) && row_index_2 < array.GetLength(0) && row_index_1 != row_index_2) 
//         for (int col = 0; col < array.GetLength(1); col++) {
//             int temp = array[row_index_1, col];
//             array[row_index_1, col] = array[row_index_2, col];
//             array[row_index_2, col] = temp;
//         }
//     else Console.WriteLine("Rows indexes aren't correct");
// }

// // int[,] myArray = GenerateRandom2DArray();
// // Show2DArray(myArray);
// // ChangeRowsPlaces(myArray, 3, 4);
// // Show2DArray(myArray);

// // ----------------------------------------Task_3----------------------------------------
// // Из двумерного массива целых чисел удалить строку и столбец, на пересечении которых расположен наименьший элемент.

// int[,] NewMatrixWithoutMinElementRowCol(int[,] array) {
//     int [,] out_array = new int[array.GetLength(0) - 1, array.GetLength(1) - 1];
//     int rows_counter_for_new_array = 0;
//     int cols_counter_for_new_array = 0;
//     int min = array[0,0];
//     int min_row = 0;
//     int min_col = 0;
//     for (int row = 0; row < array.GetLength(0); row++)
//         for (int col = 0; col < array.GetLength(1); col++)
//             if (array[row, col] < min) {
//                 min = array[row, col];
//                 min_row = row;
//                 min_col = col;
//             }
//     Console.WriteLine($"min_row: {min_row}, min_col: {min_col}");
//     for (int row = 0; row < array.GetLength(0); row++) {
//         cols_counter_for_new_array = 0;
//         for (int col = 0; col < array.GetLength(1); col++) {
//             if ((row != min_row) && (col != min_col)) {
//                 out_array[rows_counter_for_new_array, cols_counter_for_new_array] = array[row, col];
//                 cols_counter_for_new_array++;
//             }
//         }
//         if (row != min_row) rows_counter_for_new_array++;
//     }
//     return out_array;
// }

// int[,] NewMatrixWithoutMinElementRowCol_1(int[,] array) {
//     int [,] out_array = new int[array.GetLength(0) - 1, array.GetLength(1) - 1];
//     int min = array[0,0];
//     int min_row = 0;
//     int min_col = 0;
//     for (int row = 0; row < array.GetLength(0); row++)
//         for (int col = 0; col < array.GetLength(1); col++)
//             if (array[row, col] < min) {
//                 min = array[row, col];
//                 min_row = row;
//                 min_col = col;
//             }
//     Console.WriteLine($"min_row: {min_row}, min_col: {min_col}");
//     for (int row = 0, new_row = 0; row < array.GetLength(0); row++, new_row++) {
//         if (row == min_row) {
//             new_row--;
//         }
//         else {
//             for (int col = 0, new_col = 0; col < array.GetLength(1); col++, new_col++) {
//                 if (new_col == min_col) {
//                     new_col--;
//                 }
//                 else {
//                     out_array[new_row, new_col] = array[row, col];
//                 }
//             }
//         }
//     }

//     return out_array;
// }

// int[,] myArray = GenerateRandom2DArray();
// Show2DArray(myArray);
// int[,] newArray = NewMatrixWithoutMinElementRowCol(myArray);
// Show2DArray(newArray);
// int[,] newArray_1 = NewMatrixWithoutMinElementRowCol_1(myArray);
// Show2DArray(newArray_1);

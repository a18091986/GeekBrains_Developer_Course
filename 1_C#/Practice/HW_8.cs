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

// // Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.

// void SortElementsInMatrixRows(int[,] array) {
//     for (int row = 0; row < array.GetLength(0); row++) {
//         for (int repeat = 0; repeat < array.GetLength(1); repeat++) {
//             for (int col = 0; col < array.GetLength(1) - 1; col++) {
//                 if (array[row,col] < array[row,col+1]) {
//                     int temp = array[row,col];
//                     array[row, col] = array[row, col+1];
//                     array[row, col+1] = temp;
//                 }            
//             }
//         }
//     }
// }

// // int[,] myArray = GenerateRandom2DArray();
// // Show2DArray(myArray);
// // SortElementsInMatrixRows(myArray);
// // Show2DArray(myArray);

// // Например, задан массив:
// // 1 4 7 2
// // 5 9 2 3
// // 8 4 2 4
// // В итоге получается вот такой массив:
// // 7 4 2 1
// // 9 5 3 2
// // 8 4 4 2

// //**********************************************************************************************************************************************************************

// // Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
// int RowWithMinElemntsSum(int[,] array) {
//     int min_sum = 0;
//     int min_sum_row_index = 1;
//     for (int row = 0; row < array.GetLength(0); row++) {
//         int current_sum = 0;
//         for (int col = 0; col < array.GetLength(1); col++) {
//                 current_sum += array[row, col];
//                 min_sum = (row == 0) ? current_sum : (current_sum < min_sum) ? current_sum : min_sum;
//                 min_sum_row_index = (min_sum == current_sum) ? row : min_sum_row_index;
//             }
//         }
//         return min_sum_row_index;
//     }


// // int[,] myArray = GenerateRandom2DArray();
// // Show2DArray(myArray);
// // Console.WriteLine($"Index of row with min elements sum: {RowWithMinElemntsSum(myArray) + 1}");

// // Например, задан массив:
// // 1 4 7 2
// // 5 9 2 3
// // 8 4 2 4
// // 5 2 6 7
// // Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

// //**********************************************************************************************************************************************************************

// // Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

// bool CheckMatrixMulExists(int[,] arr1, int[,] arr2) {
//     return (arr1.GetLongLength(1) == arr2.GetLength(0)) ? true : false;
// }

// int[,] MatrixMul(int[,] arr1, int[,] arr2) {
//     int[,] result_arr = new int[arr1.GetLength(0), arr2.GetLength(1)];
//     for (int row1 = 0; row1 < arr1.GetLength(0); row1++) {
//         for (int col2 = 0; col2 < arr2.GetLength(1); col2++) {
//             int current_sum = 0;
//             for (int col1_row2 = 0; col1_row2 < arr1.GetLength(1); col1_row2++) {
//                 current_sum += arr1[row1, col1_row2] * arr2[col1_row2, col2];
//             }
//             result_arr[row1, col2] = current_sum;
//         }
//     }
//     return result_arr;
// }

// // Например, даны 2 матрицы:
// // 2 4 | 3 4
// // 3 2 | 3 3
// // Результирующая матрица будет:
// // 18 20
// // 15 18

// // int[,] arr1 = GenerateRandom2DArray();
// // Show2DArray(arr1);
// // int[,] arr2 = GenerateRandom2DArray();
// // Show2DArray(arr2);
// // if (CheckMatrixMulExists(arr1, arr2)) {
// //     int[,] arr1_mul_arr2 = MatrixMul(arr1, arr2);
// //     Console.WriteLine("Matrixes mul:");
// //     Show2DArray(arr1_mul_arr2);
// //     }
// // else Console.WriteLine("Matrixes with current dimensions can't be multiplied");


// //**********************************************************************************************************************************************************************

// // Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.

// // int[,,] GenerateRandom3DArray(int rows, int cols, int matrix) {
// //     int [,,] array = new int[rows, cols, matrix];
// //     int[] numbers_pool = RandomNumbersWithoutRepeat(10, 99, rows * cols * matrix);
// //     int k = 0;
// //     for (int dim = 0; dim < matrix; dim++) 
// //         for (int r = 0; r < rows; r++) 
// //             for (int c = 0; c < cols; c++) {
// //                 array[r,c,dim] = numbers_pool[k];
// //                 k++;
// //             }
// //     return array;
// // }

// // void Show3DArray(int[,,] array) {
// //     Console.WriteLine();
// //     for (int dim = 0; dim < array.GetLength(2); dim++) {
// //         Console.WriteLine($"Matrix {dim+1} / {array.GetLength(2)} \n"); 
// //         for (int r = 0; r < array.GetLength(0); r++) {
// //             for (int c = 0; c < array.GetLength(1); c++) 
// //                 Console.Write(array[r,c,dim] + "\t");
// //             Console.WriteLine();
// //         }
// //         Console.WriteLine();
// //     }
// // }

// // int[] RandomNumbersWithoutRepeat(int minValue, int maxValue, int numbers_count) {
// //     int [] out_arr = new int[numbers_count];
// //     out_arr[0] = new Random().Next(minValue, maxValue + 1);
// //     for (int i = 1; i < numbers_count; i++) {
// //         int find_element_flag = 0;
// //         int repeat_flag = 0;
// //         while (find_element_flag == 0){
// //             repeat_flag = 0;
// //             int new_number = new Random().Next(minValue, maxValue + 1);    
// //             for (int j = 0; j < i; j++) {
// //                 if (out_arr[j] == new_number) {
// //                     repeat_flag = 1;
// //                     break;    
// //                 }
// //             }
// //             if (repeat_flag == 0) {
// //                 out_arr[i] = new_number;
// //                 find_element_flag = 1;    
// //             }
// //         }
// //     }
// //     return out_arr;
// // }

// // Console.Write("Input number of rows: ");
// // int rows = Convert.ToInt32(Console.ReadLine());
// // Console.Write("Input number of columns: ");
// // int cols = Convert.ToInt32(Console.ReadLine());
// // Console.Write("Input number of matrix in 3D dimension: ");
// // int matrix = Convert.ToInt32(Console.ReadLine());
// // Console.WriteLine();
// // if ((rows * cols * matrix) > 89)
// //     Console.WriteLine("Impossible generate array with entered dimensions from pool of two-digits numbers without repeat");
// // else {
// //     int[,,] arr = GenerateRandom3DArray(rows, cols, matrix);
// //     Show3DArray(arr);
// // }


// // Массив размером 2 x 2 x 2
// // 66(0,0,0) 25(0,1,0)
// // 34(1,0,0) 41(1,1,0)
// // 27(0,0,1) 90(0,1,1)
// // 26(1,0,1) 55(1,1,1)

// //**********************************************************************************************************************************************************************

// // Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// void Show2DArray_beauty(int[,] array) {
//     Console.WriteLine();
//     for (int i = 0; i < array.GetLength(0); i++) {
//         for (int j = 0; j < array.GetLength(1); j++) {
//             if (array[i,j] > -1 && array[i,j] < 10)
//                 Console.Write($"0{array[i,j]}\t");
//             else
//                 Console.Write($"{array[i,j]}\t");
//         }
//         Console.WriteLine();
//     }
//     Console.WriteLine();
// }


// int[,] Generate2DConstantArray(int rows, int cols, int constant) {
//     int [,] array = new int[rows, cols];
//     for (int i = 0; i < rows; i++) {
//         for (int j = 0; j < cols; j++) {
//             array[i,j] = constant;
//         }
//     }
//     return array;
// }


// int[,] GenerateSpiralMatrix(int start_value, int rows, int cols) {
//     int[,] out_arr = Generate2DConstantArray(rows, cols, start_value - 1);
//     int row = 0;
//     int col = 0;
//     bool right = true, left = false, up = false, down = false;
//     int current_number = start_value;
//     while (current_number < rows*cols + start_value) {
//         if (right) {
//             while (col < cols && out_arr[row, col] == start_value - 1) {
//                 out_arr[row, col] = current_number;
//                 col++;            
//                 current_number++;
//             }
//             right = false;
//             down = true;
//             row++;
//             col--;
//         }
//         if (down) {
//             while (row < rows && out_arr[row, col] == start_value - 1) {
//                 out_arr[row, col] = current_number;
//                 row++;            
//                 current_number++;
//             }
//             left = true;
//             down = false;
//             row--;
//             col--;
//         }
//         if (left) {
//             while (col >= 0 && out_arr[row, col] == start_value - 1) {
//                 out_arr[row, col] = current_number;
//                 col--;            
//                 current_number++;
//             }
//             left = false;
//             up = true;
//             col++;
//             row--;
//         }
//         if (up) {
//             while (row >= 0 && out_arr[row, col] == start_value - 1) {
//                 out_arr[row, col] = current_number;
//                 row--;            
//                 current_number++;
//             }
//             up = false;
//             right = true;
//             row++;
//             col++;
//         }
//     }
//     return out_arr;
// }

// Console.WriteLine("Input start value: ");
// int start_value = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Input rows number: ");
// int rows = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Input cols number: ");
// int cols = Convert.ToInt32(Console.ReadLine());
// int[,] arr = GenerateSpiralMatrix(start_value, rows, cols);
// Show2DArray_beauty(arr);

// // Например, на выходе получается вот такой массив:
// // 01 02 03 04
// // 12 13 14 05
// // 11 16 15 06
// // 10 09 08 07
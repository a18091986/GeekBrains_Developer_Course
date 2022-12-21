// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.

double[,] GenerateRandomDouble2DArray() {
    Console.Write("Input number of rows: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input number of columns: ");
    int cols = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input min value: ");
    double minValue = Convert.ToDouble(Console.ReadLine());
    Console.Write("Input max value: ");
    double maxValue = Convert.ToDouble(Console.ReadLine());
    double[,] array = new double[rows, cols];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array[i,j] = Math.Round(new Random().NextDouble() * (maxValue - minValue) + minValue, 2);
        }
    }
    return array;
}

void Show2DDoubleArray(double[,] array) {
    for (int i = 0; i < array.GetLength(0); i++) {
        for (int j = 0; j < array.GetLength(1); j++) {
            Console.Write(array[i,j] + "\t");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}

double[,] arr = GenerateRandomDouble2DArray();
Show2DDoubleArray(arr);

// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.

bool IsElementInArray(int row, int col, double[,] arr) {
    return (arr.GetLength(0) > row && arr.GetLength(1) > col);
}

 double ElementByIndexes(int row, int col, double[,] arr) {
    return arr[row, col];
 }

Console.Write("Input row index: ");
int row = Convert.ToInt32(Console.ReadLine());
Console.Write("Input col index: ");
int col = Convert.ToInt32(Console.ReadLine());

string answer = IsElementInArray(row, col, arr) ? $"Искомый элемент: {ElementByIndexes(row, col, arr)}" : "Элемент с заданными индексами отсутствует в массиве!";
Console.WriteLine(answer);

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 1 7 -> числа с такими индексами в массиве нет

// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

int [,] GenerateRandom2DArray() {
    Console.Write("Input number of rows: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input number of columns: ");
    int cols = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input min value: ");
    int minValue = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input max value: ");
    int maxValue = Convert.ToInt32(Console.ReadLine());
    int [,] array = new int[rows, cols];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array[i,j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return array;
}

void Show2DIntArray(int[,] array) {
    for (int i = 0; i < array.GetLength(0); i++) {
        for (int j = 0; j < array.GetLength(1); j++) {
            Console.Write(array[i,j] + "\t");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}

void ColumnsMeanInArray(int[,] arr) {

    for (int col = 0; col < arr.GetLength(1); col++) {
        double sum = 0.0;
        for (int row = 0; row < arr.GetLength(0); row++) {
            sum += arr[row, col];
        }
        Console.WriteLine($"Средне арифметическое столбца {col}: {Math.Round(sum / arr.GetLength(0), 2)}");

    }
}

int[,] arr_int = GenerateRandom2DArray();
Show2DIntArray(arr_int);
ColumnsMeanInArray(arr_int);




// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.
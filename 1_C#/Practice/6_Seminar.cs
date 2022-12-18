// //  есть ссылочные (array) и значимые типы данных (int)
// // ----------------------------------------Task_1----------------------------------------

// // Напишите программу, которая перевернёт одномерный массив (последний элемент будет на первом месте, а первый - на последнем и т.д.)

// int[] GenerateRandomIntArray(int arr_size, int min_val, int max_val) {
//     int[] array = new int[arr_size];

//     for (int i = 0; i < arr_size; i++)
//         array[i] = new Random().Next(min_val, max_val + 1);
    
//     return array;
// }

// void PrintIntArray(int[] arr) {
//     for (int i = 0; i < arr.Length; i++)
//         Console.Write($"{arr[i]} ");
//     Console.WriteLine();
// }


// void RevertArray_1(int[] array) {
//     for (int i = 0; i < array.Length / 2; i++) {
//         int temp = array[i];
//         array[i] = array[array.Length - 1 - i];
//         array[array.Length - 1 - i] = temp;
//     }
// }

// void RevertArray_2(int[] array) {
//     for (int i = 0, j = array.Length - 1; i < j; i++, j--) {
//         int temp = array[i];
//         array[i] = array[j];
//         array[j] = temp;
//     }
// }

// int [] array = GenerateRandomIntArray(5, 1, 5);
// Console.Write("Сгенерированный массив: ");
// PrintIntArray(array);
// Console.Write("Массив после перестановки элементов местами по методу 1: ");
// RevertArray_1(array);
// PrintIntArray(array);
// Console.Write("Массив после перестановки элементов местами по методу 2: ");
// RevertArray_2(array);
// PrintIntArray(array);


// // ----------------------------------------Task_2----------------------------------------
// Console.WriteLine($"************************************************************************************************************");
// // Напишите программу, которая принимает на вход три числа и проверяет, может ли существовать треугольник с сторонами такой длины.

// bool ExistTriangle(int a, int b, int c) {
//     return (((a + b) > c) && ((a + c) > b) && ((b + c) > a));
// }

// int[] array_for_triangle = GenerateRandomIntArray(3, 1, 10);
// PrintIntArray(array_for_triangle);
// Console.WriteLine($"Существование треугольника, стороны которого заданы приведенными массивом: {ExistTriangle(array[0], array[1], array[2])}");


// // ----------------------------------------Task_3----------------------------------------
// Console.WriteLine($"************************************************************************************************************");
// // Не используя рекурсию, выведите первые N чисел Фибоначчи. Первые два числа Фибоначчи: a и b.

// void GenerateFib(int [] fib, int a, int b) {
//     fib[0] = a;
//     fib[1] = b;
//     for (int i = 2; i < fib.Length; i++)
//         fib[i] = fib[i-1] + fib[i-2];
//  }


// Console.Write("N: ");
// int N = Convert.ToInt32(Console.ReadLine());
// Console.Write("a: ");
// int a = Convert.ToInt32(Console.ReadLine());
// Console.Write("b: ");
// int b = Convert.ToInt32(Console.ReadLine());

// int [] fib = new int[N];
// PrintIntArray(fib);
// GenerateFib(fib, a, b);
// PrintIntArray(fib);
 



// // ----------------------------------------Task_4----------------------------------------
// Console.WriteLine($"************************************************************************************************************");
// // Напишите программу, которая будет создавать копию заданного массива с помощью поэлементного копирования.

// int[] ArrCpy(int[] arr) {
//     int [] arr_out = new int[arr.Length];
//     for (int i = 0; i < arr.Length; i++) {
//         arr_out[i] = arr[i];
//     }
//     return arr_out;
// }

// int[] initial_array = GenerateRandomIntArray(5, 1, 4);
// Console.WriteLine($"Initial Array: ");
// PrintIntArray(initial_array);
// Console.WriteLine($"Result Array: ");
// PrintIntArray(ArrCpy(initial_array));




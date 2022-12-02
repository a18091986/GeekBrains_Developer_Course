// -------------------------------------Функции-----------------------------------
// в контексте С# не существует понятия функция - тут это называется методами


// int Max(int arg1, int arg2, int arg3) {
//     int result = arg1;
//     if (arg2 > result) result = arg2;
//     if (arg3 > result) result = arg3;
//     return result;
// }

// void FillArray(int[] array) {
//     int length = array.Length;
//     int index = 0;
//     while (index < length) {
//         array[index] = new Random().Next(1,10);
//         index++;
//     }
// }

// void PrintArray(int[] array) {
//     // int length = array.Length;
//     int index = 0;
//     while (index < array.Length) {
//         Console.Write($"{array[index]} ");
//         index++;
//     }
// }

// int FindFirstIndexOfElement(int[] array, int element) {
//     int index = 0;
//     int result = -1;
//     while (index < array.Length) {
//         if (array[index] == element) {
//             result = index;
//             break;
//         }
//         index++;
//     }
//     return result;
// }

// int n1, n2, n3;

// Console.Write("Input number: ");
// n1 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input number: ");
// n2 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input number: ");
// n3 = Convert.ToInt32(Console.ReadLine());

// Console.WriteLine(Max(n1, n2, n3));


// -------------------------------------Массивы-----------------------------------
// int[] array = {0,0,0,0}
// int[] array = new int[5]
// int[] array = new int[]{0,0,0,0,0}
// int[] array = new int[5]{1,2,3,4,5}

// int[] array = {1, 2, 4, 5, 7, 10, 123, 1234, 1, 10};
// array[0] = 1000;
// // Console.WriteLine(array[0]);

// // поиск индекса заданного элемента массива
// int n = array.Length;
// int find = 10;
// int index = 0;

// while (index < n) {
//     if (array[index] == find) {
//         Console.WriteLine(index);
//         break;
//     }
//     index++;
// }

// int[] new_array = new int[10]; // по умолчанию заполняется нулями
// FillArray(new_array);
// PrintArray(new_array);

// // вывод позиции элемента в массиве
// int index_of_element = FindFirstIndexOfElement(new_array, 4);
// string info_message;
// Console.WriteLine();
// info_message = (index_of_element == -1) ?  "такого элемента нет в массиве" : Convert.ToString(index_of_element);
// Console.WriteLine(index_of_element);
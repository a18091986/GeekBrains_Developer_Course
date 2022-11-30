// Console.WriteLine("Hello!");
// Console.Readline();
// int float double bool a = true; string " "; char ' ';

// var a = 5.4 - автоматическое присвоение типа
// int a = 5, b = 3;

// ------------------------------   Форматированный вывод ---------------------------------------------------

// Console.WriteLine("My number is " + a);
// Console.WriteLine($"My numbers are {a} and {b}");


// ------------------------------   Считывание данных ---------------------------------------------------

// Console.Write("Input Number: "); // не переносит курсор на новую строку
// string input_var = Console.ReadLine();
// int input_num = Convert.ToInt32(Console.ReadLine());

// ------------------------------  Task_1 ---------------------------------------------------------------------
// Напишите программу, которая на вход принимает два числа и проверяет, является ли первое число квадратом второго.

// Console.Write("Input first number: ");
// int num_1 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input second number: ");
// int num_2 = Convert.ToInt32(Console.ReadLine());

// int quad = num_2 * num_2;

// if (quad == num_1) {
//     Console.WriteLine($"First number {num_1} is equal to quad of second number {num_2}");
// } else {
//     Console.WriteLine($"First number {num_1} is not equal to quad of second number {num_2}");
// }

// ------------------------------  Task_2 ---------------------------------------------------------------------
// Напишите программу, которая на вход принимает одно число (N), а на выходе показывает все целые числа в промежутке от -N до N

// Console.Write("Input integer number: ");
// int num = Convert.ToInt32(Console.ReadLine());
// int current = -num;

// while (current <= num) {
//     Console.Write($"{current} ");
//     current++;
// }


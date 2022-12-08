// Задача 19
// Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.

// void IsPalindrom_via_convert_type(int number) {
//     string num = Convert.ToString(number);
//     int flag_not_palindrom = 0;
//     for (int i = 0; i < num.Length; i++) {
//         if (num[i] != num[num.Length - i - 1]) {
//             Console.WriteLine($"{number} is not palindrom by convert number to string method");
//             flag_not_palindrom = 1;
//             break;
//         }
//     }
//     if (flag_not_palindrom == 0) Console.WriteLine($"{number} is palindrom by convert number to string method");
// }

// int GetNumberLen(int number) {
//     int len = 0;
//     while ( number / (int) Math.Pow(10, len) > 0) len++;
//     return len;
// }

// void IsPalindrom_via_digits_split(int number) {
//     int number_len = GetNumberLen(number);
//     int flag_not_palindrom = 0;
//     for (int i = 0; i < number_len; i++) {
//         if (number / (int) Math.Pow(10, i) % 10 != number / (int) Math.Pow(10, number_len - i - 1) % 10) {
//             flag_not_palindrom = 1;
//             Console.WriteLine($"{number} is not palindrom by split number on digits method");
//             break;
//         }
        
//     }
//     if (flag_not_palindrom == 0) Console.WriteLine($"{number} is palindrom by split number on digits method");
// }

// Console.WriteLine("Введи число для проверки его на палиндром: ");
// int number = Convert.ToInt32(Console.ReadLine());
// IsPalindrom_via_convert_type(number);
// IsPalindrom_via_digits_split(number);


// 14212 -> нет
// 12821 -> да
// 23432 -> да

// Задача 21
// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.

// double Length(double xA, double yA, double zA, double xB, double yB, double zB) {
//     return Math.Sqrt(Math.Pow(xB - xA, 2) + Math.Pow(yB - yA, 2) + Math.Pow(zA - zB, 2));
// }

// Console.WriteLine("Введи координату x первой точки: ");
// double xA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату y первой точки: ");
// double yA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату z первой точки: ");
// double zA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату x второй точки: ");
// double xB = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату y второй точки: ");
// double yB = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату z второй точки: ");
// double zB = Convert.ToDouble(Console.ReadLine());


// Console.WriteLine($"Расстояние между введенными точками: {Math.Round(Length(xA, yA, zA, xB, yB, zB), 2)}");


// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

// Задача 23
// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.

// void Qubes(int count) {
//     for (int i = 1; i <= count; i++) Console.WriteLine($"{i}: {Math.Pow(i, 3)}");
// }

// Console.WriteLine("Введи число, до которого включительно переберем все числа и выведем их кубы: ");
// Qubes(Convert.ToInt32(Console.ReadLine()));

// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125
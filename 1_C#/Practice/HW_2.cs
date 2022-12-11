// Задача: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.

// int SecondDigitOfNumber(int num) {
//     return (num % 100 / 10);
// }

// Console.Write("Input number: ");
// Console.WriteLine($"Вторая цифра введенного числа: {SecondDigitOfNumber(Convert.ToInt32(Console.ReadLine()))}");

// 456 -> 5
// 782 -> 8
// 918 -> 1

// Задача: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.

// int ThirdDigitOfNumber(int num) {
//     if (num < 100) {
//         return -1;
//     } else {
//         while (num / 10 >= 100)
//             num = num / 10;
//     }
//     return num % 10;
// }

// Console.Write("Input number: ");
// int num = Convert.ToInt32(Console.ReadLine());
// string answer = (ThirdDigitOfNumber(num) == -1) ? "Третьей цифры нет" : Convert.ToString(ThirdDigitOfNumber(num));
// Console.WriteLine(answer);

// // 645 -> 5
// // 78 -> третьей цифры нет
// // 32679 -> 6

// Задача: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

// bool IsWeekend(int day) {
//     return (day == 6 || day == 7);
// }

// Console.Write("Input day of week: ");
// string answer = IsWeekend(Convert.ToInt32(Console.ReadLine())) ? "да" : "нет";
// Console.WriteLine(answer);

// // 6 -> да
// // 7 -> да
// // 1 -> нет
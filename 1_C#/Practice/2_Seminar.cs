// ---------------------------------------Task_1-------------------------------------------------------
// Напишите программу, которая выводит случайное трёхзначное число и удаляет вторую цифру этого числа.

// int CutSecondDigitOfNumber(int num) {
//     int digit_1 = num / 100;
//     int digit_2 = num % 10;
//     num = 10 * digit_1 + digit_2;
//     return num;
// }


// // Console.Write("Введи трёхзначное число: ");
// // int num = Convert.ToInt32(Console.ReadLine());

// int num = new Random().Next(100, 1000);
// Console.WriteLine($"Проинициализированное число: {num}");
// Console.WriteLine($"Итоговое число: CutSecondDigitOfNumber(num)");


// ---------------------------------------Task_2-------------------------------------------------------
// Напишите программу, которая выводит случайное число из отрезка [10, 99] и показывает наибольшую цифру числа.

// int MaxDigitFromNumber(int num) {
//     if ((num / 10) >= (num % 10))
//         return num / 10;
//     else   
//         return num % 10;
// }

// int num = new Random().Next(10,100);
// Console.WriteLine($"Проинициализированное число: {num}, Максимальная цифра: {MaxDigitFromNumber(num)}");

// ---------------------------------------Task_2-------------------------------------------------------
// Напишите программу, которая будет принимать на вход два числа и выводить, является ли второе число кратным первому.

// Boolean multiple_nums(int num_1, int num_2) {
    
//     return (num_2 % num_1 == 0); 
// }

// Console.WriteLine("Input first num: ");
// int num_1 = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("Input second num: ");
// int num_2 = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine(multiple_nums(num_1, num_2));


// ---------------------------------------Task_3-------------------------------------------------------
// Напишите программу, которая принимает на вход число и проверяет, кратно ли оно одновременно a и b.

// bool multiple_nums_2(int num_1, int num_2, int num_3) {
//     return (num_3 % num_1 == 0 && num_3 % num_3 == 0);
// }

// Console.Write("Input first number: ");
// int num_1 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input second number: ");
// int num_2 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Input third number (для проверки его кратности первым двум числам): ");
// int num_3 = Convert.ToInt32(Console.ReadLine());

// bool result = multiple_nums_2(num_1, num_2, num_3);
// Console.WriteLine(result); 
// string answer = (result) ? $"{num_3} кратно {num_1} и {num_2}" : $"{num_3} не кратно {num_1} и {num_2}";
// Console.WriteLine(answer); 

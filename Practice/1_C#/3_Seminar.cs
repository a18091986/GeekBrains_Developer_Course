// int a = 3;
// int b = 4;

// Console.WriteLine(Math.Pow(a,b));
// Console.WriteLine(Math.Sqrt(b));
// Console.WriteLine(Math.Round(Math.Sqrt(3), 3));


// -----------------------------------TASK_1-----------------------------------------------------
// Напишите программу, которая принимает на вход координаты точки (X и Y), 
// причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится эта точка.

// int FindQuadrant(double x, double y) {
//     if (x > 0 && y > 0) return 1;
//     if (x < 0 && y > 0) return 2;
//     if (x < 0 && y < 0) return 3;
//     if (x > 0 && y < 0) return 4;
//     return 0;
// }

// Console.Write("Input x: ");
// double xA = Convert.ToDouble(Console.ReadLine());
// Console.Write("Input y: ");
// double yA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine($"Точка ({xA}, {yA}) находится в {FindQuadrant(xA, yA)} четверти");

// -----------------------------------TASK_2-----------------------------------------------------
// Напишите программу, которая по заданному номеру четверти, показывает диапазон возможных координат точек в этой четверти (x и y).

// void CoordinateRange(int Quadrant) {
//     if (Quadrant == 1) Console.WriteLine("Диапазон: x > 0; y > 0");
//     if (Quadrant == 2) Console.WriteLine("Диапазон: x < 0; y > 0");
//     if (Quadrant == 3) Console.WriteLine("Диапазон: x < 0; y < 0");
//     if (Quadrant == 4) Console.WriteLine("Диапазон: x > 0; y < 0");
// }
// Console.WriteLine("Введи номер четверти: ");
// CoordinateRange(Convert.ToInt32(Console.ReadLine()));

// -----------------------------------TASK_2-----------------------------------------------------
// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве.

// double Length(double xA, double yA, double xB, double yB) {
//     return Math.Sqrt(Math.Pow(xB - xA, 2) + Math.Pow(yB - yA, 2));
// }

// Console.WriteLine("Введи координату x первой точки: ");
// double xA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату y первой точки: ");
// double yA = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату x второй точки: ");
// double xB = Convert.ToDouble(Console.ReadLine());
// Console.WriteLine("Введи координату y второй точки: ");
// double yB = Convert.ToDouble(Console.ReadLine());

// Console.WriteLine($"Расстояние между введенными точками: {Math.Round(Length(xA, yA, xB, yB), 2)}");


// -----------------------------------TASK_3-----------------------------------------------------
// Напишите программу, которая принимает на вход число (N) и выдаёт ряд квадратов чисел от 1 до N.

// void Quadrants(int count) {
//     for (int i = 1; i <= count; i++) Console.Write($"{Math.Pow(i, 2)} ");
// }

// Console.WriteLine("Введи число, до которого включительно переберем все числа и выведем их квадраты: ");
// Quadrants(Convert.ToInt32(Console.ReadLine()));
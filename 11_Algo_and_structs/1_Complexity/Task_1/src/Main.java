//Необходимо написать алгоритм, считающий сумму всех чисел
//от 1 до N. Согласно свойствам линейной сложности,
//количество итераций цикла будет линейно изменяться
//относительно изменения размера N.

public class Main {
    public static void main(String[] args) {
        System.out.println(TotalAmount(5));
        System.out.println(TotalAmount_2(5));
    }

    // Временная сложность О(0)
    public static Integer TotalAmount(int value) {
        return (value * (value + 1) / 2);
    }

    // Временная сложность О(n)
    public static Integer TotalAmount_2(int var) {
        int sum = 0;
        for (int i = 1; i <= var; i++)
            sum += i;
        return sum;
    }
}
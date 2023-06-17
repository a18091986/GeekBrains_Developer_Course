
//1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
//2. Считаем, что 1 и 2 значения последовательности равны 1.
//3. Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.


public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
//Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
//Фибоначчи и определить, какой из них работает быстрее. Так различия
//начнутся уже с 40 члена последовательности.
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date start_1 = new Date();
        System.out.println(fibo(39));
        Date end_1 = new Date();
        System.out.println(end_1.getTime() - start_1.getTime());
        Date start_2 = new Date();
        System.out.println(fibo_1(40));
        Date end_2 = new Date();
        System.out.println(end_2.getTime() - start_2.getTime());
    }
    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
    public static int fibo_1(int n) {
        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;
        int [] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i <= n; i++)
            array[i] = array[i - 1] + array[i - 2];
        return array[n-1];
    }
}
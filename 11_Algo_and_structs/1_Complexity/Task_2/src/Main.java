//Написать алгоритм поиска простых чисел (делятся только на себя и
//на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
//вложенный for, что явно говорит о квадратичной сложности, на этом
//стоит акцентировать внимание

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(FindSimpleNumbers(11));
    }

    public static List<Integer> FindSimpleNumbers(int val) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= val; i++) {
           boolean flag = false;
           for (int j = 2; j < i; j++) {
               if (i % j == 0) {
                   flag = true;
                   break;
               }
           }
           if (!flag)
               result.add(i);
        }
        return result;
    }
}
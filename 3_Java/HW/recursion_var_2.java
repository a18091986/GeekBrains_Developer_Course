// package 5;

import java.util.ArrayList;
import java.util.List;

public class recursion_var_2 {
    /*
    5.	Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
    например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
    Предложить хотя бы одно решение или сообщить, что его нет.
    */
    static char[] data;
    static List<Integer> symbolIndex;
    static boolean solveFinded = false;

    public static void main(String[] args) {
        String inputData = "568? + 110? = 678?";
        findTrueNumber(inputData);
        if (solveFinded){
            System.out.println("Solved");
        }else {
            System.out.println("We didn't do it!");
        }

    }

    public static void findTrueNumber(String inputData) {
        data = inputData.replace(" ", "").toCharArray();
        // System.out.println(data);
        char searchingSymbol = '?';
        symbolIndex = findSymbolIndex(data, searchingSymbol);
        System.out.println(symbolIndex);
        // combWithRec(new int[symbolIndex.size()], 0, 10);
        combWithRec(new int[symbolIndex.size()], 0);
    }

    // public static void combWithRec(int[] comb, int index, int k) {
    public static void combWithRec(int[] comb, int index) {
        if (index == comb.length) {
            checkComb(comb);
            return;
        }

        // for (int i = 0; i < k; i++) {
        for (int i = 0; i < 10; i++) {
            comb[index] = i;
            // combWithRec(comb, index + 1, k);
            combWithRec(comb, index + 1);
        }
    }

    public static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            data[symbolIndex.get(i)] = Character.forDigit(comb[i], 10);
            // System.out.println(symbolIndex);
        }

        String[] numbers = String.valueOf(data).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d\n", a, b, c);
            solveFinded = true;
        }

    }

    public static List<Integer> findSymbolIndex(char[] data, char symbol) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '+' || data[i] == '=') {
                data[i] = '-';
            }
            if (data[i] == symbol) {
                result.add(i);
            }
        }
        // System.out.println(data);
        return result;
    }

}
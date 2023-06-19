//1.Необходимо написать один из простых алгоритмов сортировки,
//имеющий сложность O(n2).
//2.Можно выбрать из пузырьковой сортировки, сортировки вставками и
//сортировки выбором.
//3.Следует обратить внимание на сложность данных алгоритмов и
//указать признаки квадратичной сложности для каждого из них.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =new int [] {1,2, 3, -100, 10, -40, 4, 20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort (int[] a) {
        int last_swap = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            boolean is_sorted = false;
            int current_swap = -1;
            for (int j = 0; j < last_swap; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    is_sorted = false;
                    current_swap = j;
                }
            }
            if (is_sorted) return;
            last_swap = current_swap;
        }
    }
}
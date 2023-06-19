
//1.Пишем тесты для сравнения производительности сортировки больших массивов.
//2.Для наглядного результата стоит сравнивать массивы до 100 000 элементов.
//При таком подходе будет явно видно, какая из сортировок окажется быстрее.

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            bubbleSort(arr);
            Date endDate = new Date();
            long bbsDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            quicksort(arr, arr[0], arr[arr.length - 1]);
            endDate = new Date();
            long qsDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, bbs: %s, qs: %s\n", i, bbsDuration, qsDuration);
        }
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

    public static void quicksort(int[] arr, int start, int end) {
        int pivot = arr[(end - start) / 2 + start];
        int left = start;
        int right = end;
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;
            }
        }
        if (start < right) {
            quicksort(arr, start, right);
        }
        if (end > left) {
            quicksort(arr, left, end);
        }
    }
}

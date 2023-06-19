//1.После успешной сортировки массива на нем можно использовать бинарный
//поиск. Необходимо реализовать алгоритм бинарного поиска по
//элементам.
//2.Стоит акцентировать внимание, что т.к. алгоритм использует подход
//«разделяй и властвуй», его удобно писать с помощью рекурсии.
//3.Так что стоит акцентировать внимание на алгоритмическую сложность
//данного алгоритма, что его выполнение многократно быстрее простого
//перебора на больших массивах

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =new int [] {1,2, 3, -100, 10, -40, 4, 20};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));
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

    public static int binarySearch(int [] arr, int val, int min, int max) {
        int midpoint = 0;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (arr[midpoint] < val) {
            return binarySearch(arr, val, midpoint + 1, max);
        } else if (arr[midpoint] > val){
            return binarySearch(arr, val, min, midpoint - 1);
        } else {
            return midpoint;
        }
    }
}
//1.Написать алгоритм быстрого поиска (quicksort)


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =new int [] {1,2, 3, -100, 10, -40, 4, 20};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
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
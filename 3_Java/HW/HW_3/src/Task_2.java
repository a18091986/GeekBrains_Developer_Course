package src;

import java.sql.Array;
import java.util.Arrays;

public class Task_2 {

    public static int[] remove_even_ind(int[] arr) {
        int new_length = arr.length % 2 == 0 ? arr.length / 2 : arr.length / 2 + 1;
        int[] out_arr = new int[new_length];
        for (int i = 0, k = 0; i < arr.length; i++)
            if (i % 2 != 0)
                out_arr[k++] = arr[i];
        return out_arr;
    }
    public static int[] remove_even_elems(int[] arr) {
        int new_length = 0;
        for (int el : arr)
            if (el % 2 != 0)
                new_length++;
        int[] out_arr = new int[new_length];
        for (int i = 0, k = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0)
                out_arr[k++] = arr[i];
        return out_arr;
    }
}
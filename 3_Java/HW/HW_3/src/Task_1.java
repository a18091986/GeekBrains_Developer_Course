package src;

import java.util.Arrays;

public class Task_1 {

    public static void merge(double [] arr_1, double [] arr_2) {
        double [] arr_out = new double[arr_1.length + arr_2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr_1.length && j < arr_2.length) {
            if (arr_1[i] < arr_2[j])
                arr_out[k++] = arr_1[i++];
            else
                arr_out[k++] = arr_2[j++];
        }
        while (k < arr_out.length) {
            arr_out[k++] = (i != arr_1.length) ? arr_1[i++] : arr_2[j++];
        }
        System.out.println(Arrays.toString(arr_out));
    }
}


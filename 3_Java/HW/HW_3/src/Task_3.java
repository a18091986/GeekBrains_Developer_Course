package src;

import java.sql.Array;
import java.util.Arrays;

public class Task_3 {
    int min;
    int max;
    double mean;

    public Task_3(int[] arr) {
        this.max = arr[0];
        this.min = arr[0];
        int sum = 0;
        for (int el: arr) {
            if (el > this.max)
                this.max = el;
            if (el < this.min)
                this.min = el;
            sum += el;
        }
        this.mean = (double) sum / arr.length;
    }
}
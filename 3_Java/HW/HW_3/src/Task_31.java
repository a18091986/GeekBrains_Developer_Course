package src;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_31 {
    int min;
    int max;
    double mean;

    public Task_31(ArrayList<Integer> lst) {
        this.max = lst.get(0);
        this.min = lst.get(0);
        int sum = 0;

        for (int el: lst) {
            if (el > this.max)
                this.max = el;
            if (el < this.min)
                this.min = el;
            sum += el;
        }
        this.mean = (double) sum / lst.size();
    }
}
package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr_length = 20;
        Common general = new Common();
        double[] arr_1 = Common.random_array_generate(arr_length);
        double[] arr_2 = Common.random_array_generate(arr_length);

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        System.out.println(Arrays.toString(arr_1));
        System.out.println(Arrays.toString(arr_2));

        Task_1 tk1 = new Task_1();
        Task_1.merge(arr_1, arr_2);


    }
}

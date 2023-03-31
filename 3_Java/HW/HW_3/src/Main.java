package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------TASK_1----------------------------------------");

        int arr_length = 20;
        double[] arr_1 = Common.random_double_array_generate(arr_length);
        System.out.println("Сгенерированный массив:\n" + Arrays.toString(arr_1));

        Task_1 tk1 = new Task_1();
        arr_1 = Task_1.merge_sort(arr_1);
        System.out.println("Отсортированный по алгоритму слиянием массив:\n" + Arrays.toString(arr_1));

        System.out.println("----------------------------------------TASK_2----------------------------------------");

        int [] arr_2 = Common.random_int_array_generate(arr_length);
        System.out.println("Сгенерированный массив:\n" + Arrays.toString(arr_2));
        int [] arr_2_without_even_ind = Task_2.remove_even_ind(arr_2);
        int [] arr_2_without_even_elems = Task_2.remove_even_elems(arr_2);
        System.out.println("Массив без элементов на четных индексах изначального массива:\n" + Arrays.toString(arr_2_without_even_ind));
        System.out.println("Массив без четных элементов:\n" + Arrays.toString(arr_2_without_even_elems));

        System.out.println("----------------------------------------TASK_3----------------------------------------");

        int [] arr_3 = Common.random_int_array_generate(arr_length);
        System.out.println("Сгенерированный массив:\n" + Arrays.toString(arr_3));

        Task_3 tk3 = new Task_3(arr_3);
        System.out.printf("Минимальный элемент массива %d\nМаксимальный элемент массива %d\nСреднее %f",
                tk3.min, tk3.max, tk3.mean);

    }
}







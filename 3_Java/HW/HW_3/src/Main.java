package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        System.out.println("-------------------------------------Через массивы--------------------------------------");

        int [] arr_2 = Common.random_int_array_generate(arr_length);
        System.out.println("Сгенерированный массив:\n" + Arrays.toString(arr_2));
        int [] arr_2_without_even_ind = Task_2.remove_even_ind(arr_2);
        int [] arr_2_without_even_elems = Task_2.remove_even_elems(arr_2);
        System.out.println("Массив без элементов на четных индексах изначального массива:\n" + Arrays.toString(arr_2_without_even_ind));
        System.out.println("Массив без четных элементов:\n" + Arrays.toString(arr_2_without_even_elems));

        System.out.println("-----------------------------------С помощью списков-----------------------------------");

        ArrayList<Integer> lst_1= Common.random_int_list_generate(7,15,10);
        System.out.println("Сгенерированный список:\n" + lst_1);
        ArrayList<Integer> lst_1_without_even_ind = Task_2.remove_even_ind_by_lst(lst_1);
        ArrayList<Integer> lst_1_without_even_elems_by_lst = Task_2.remove_even_elems_by_lst(lst_1);

        System.out.println("Список без элементов на четных индексах изначального списка:\n" + lst_1_without_even_ind);
        System.out.println("Список без четных элементов:\n" + lst_1_without_even_elems_by_lst);

        System.out.println("-----------------------------------С помощью списков 2----------------------------");

        ArrayList<Integer> lst_11= Common.random_int_list_generate(7,15,10);
        ArrayList<Integer> lst_11copy = (ArrayList<Integer>) lst_11.clone();
        System.out.println("Сгенерированный список:\n" + lst_11);

        Task_2.remove_even_ind_in_list(lst_11);
        Task_2.remove_even_in_list(lst_11copy);

        System.out.println("Список без элементов на четных индексах изначального списка:\n" + lst_11);
        System.out.println("Список без четных элементов:\n" + lst_11copy);


        System.out.println("----------------------------------------TASK_3----------------------------------------");
        System.out.println("-------------------------------------Через массивы--------------------------------------");

        int [] arr_3 = Common.random_int_array_generate(arr_length);
        System.out.println("Сгенерированный массив:\n" + Arrays.toString(arr_3));

        Task_3 tk3 = new Task_3(arr_3);
        System.out.printf("Минимальный элемент массива %d\nМаксимальный элемент массива %d\nСреднее %f\n",
                tk3.min, tk3.max, tk3.mean);

        System.out.println("-----------------------------------С помощью списков-----------------------------------");

        ArrayList<Integer> lst_2= Common.random_int_list_generate(7,15,5);
        System.out.println("Сгенерированный список:\n" + lst_2);

        Task_31 tk31 = new Task_31(lst_2);
        System.out.printf("""
                        Минимальный элемент списка через самописную функцию: %d
                        Максимальный элемент списка через самописную функцию: %d
                        """,
                          tk31.min, tk31.max);
        System.out.printf("""
                        Минимальный элемент списка с помощью Сollections: %d
                        Максимальный элемент списка c помощью Collections: %d
                        """,
                          Collections.min(lst_2), Collections.max(lst_2));
        System.out.printf("Среднее значение списка: %f\n", tk31.mean);
    }
}







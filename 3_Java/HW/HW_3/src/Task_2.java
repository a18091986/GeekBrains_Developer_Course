package src;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

    public static ArrayList <Integer> remove_even_ind_by_lst(ArrayList <Integer> lst) {
        ArrayList <Integer> out_lst = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++)
            if (i % 2 != 0)
                out_lst.add(lst.get(i));
        return out_lst;
    }
    public static ArrayList <Integer> remove_even_elems_by_lst(ArrayList <Integer> lst) {
        ArrayList <Integer> out_lst = new ArrayList<>();
        for (int el : lst)
            if (el % 2 != 0)
                out_lst.add(el);

        return out_lst;
    }
    public static void remove_even_ind_in_list(ArrayList <Integer> lst) {
        for (int i = 0; i < lst.size(); i++)
            lst.remove(i);
    }
    public static void remove_even_in_list(ArrayList <Integer> lst) {
        Iterator <Integer> lst_iter = lst.iterator();
        while (lst_iter.hasNext()) {
            int elem = lst_iter.next();
            if (elem % 2 == 0)
                lst_iter.remove();
        }
    }
}
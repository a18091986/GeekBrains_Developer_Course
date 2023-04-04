package src;

import java.util.LinkedList;

public class Task_1 {
    public static void reverse(LinkedList<Integer> in) {
        int temp;
        for (int i = 0; i <= in.size() / 2 - 1; i++) {
            temp = in.get(i);
            in.set(i, in.get(in.size() - 1 - i));
            in.set(in.size() - 1 - i, temp);
        }
//        return in;
    }
}

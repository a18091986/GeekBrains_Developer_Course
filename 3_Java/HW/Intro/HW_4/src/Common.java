package src;

import java.util.LinkedList;
import java.util.Random;

public class Common {
    public static LinkedList <Integer> generate_random_linked_list(int size, int min, int max) {
        LinkedList <Integer> out = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            out.add(min + r.nextInt(max) + 1);
        }
        return out;
    }
}

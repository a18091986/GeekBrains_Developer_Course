package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Common {
    public static double [] random_double_array_generate(int length) {
        return ThreadLocalRandom.current().doubles(length).toArray();
    }

    public static int [] random_int_array_generate(int length) {
        return IntStream.generate(() -> new Random().nextInt(10)).limit(7).toArray();
    }

    public static ArrayList<Integer> random_int_list_generate(int min, int max, int length) {
        ArrayList <Integer> out = new ArrayList<>();
        for (int i=0; i<length; i++) {
            out.add(new Random().nextInt(min, max));
        }
        return out;
    }
}

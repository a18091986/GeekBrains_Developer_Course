package src;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Common {
    public static double [] random_double_array_generate(int length) {
        return ThreadLocalRandom.current().doubles(length).toArray();
    }

    public static int [] random_int_array_generate(int length) {
        return IntStream.generate(() -> new Random().nextInt(10)).limit(7).toArray();
    }
}

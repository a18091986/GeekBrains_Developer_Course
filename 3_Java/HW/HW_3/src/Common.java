package src;
import java.util.concurrent.ThreadLocalRandom;

public class Common {
    public static double [] random_array_generate(int length) {
        return ThreadLocalRandom.current().doubles(length).toArray();
    }
}

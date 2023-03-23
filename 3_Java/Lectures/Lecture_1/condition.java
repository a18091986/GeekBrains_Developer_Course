public class condition {
    public static void main (String[] args) {
        int c, a = 1, b = 2;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.printf("Max %d and %d is: 2\n", a,b,c);
        System.out.printf("Max: %d", a < b ? b : a);
    }
}

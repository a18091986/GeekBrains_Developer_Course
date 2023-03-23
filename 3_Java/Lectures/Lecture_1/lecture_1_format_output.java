import javax.print.attribute.standard.Media;

public class lecture_1_format_output {
    public static void main (String [] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d\n", a, b, c);
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.println(res);

        // спецификаторы: %d, %x (шестнадцатеричные числа), %f (c плавающей точкой), %e (в экспоненциальной форме), %с (одиночный символ) 

        // вывод количества знаков после запятой

        float pi = 3.1415f;
        System.out.printf("%f\n", pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%e\n", pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);
    }    
}

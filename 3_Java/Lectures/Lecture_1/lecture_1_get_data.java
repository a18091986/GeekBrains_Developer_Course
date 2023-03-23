import java.util.Scanner;

public class lecture_1_get_data {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!\n", name);
        // System.out.printf("int: ");
        // int int_num = iScanner.nextInt();
        // System.out.println("int: " + int_num);
        // System.out.printf("float: ");
        // float float_num = iScanner.nextFloat();
        // System.out.println("float: " + float_num);
        // iScanner.close();

        // валидация данных 

        Scanner iScanner_1 = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner_1.hasNextInt();

        System.out.println(flag);
        int i = iScanner_1.nextInt();
        System.out.println(i);
        iScanner_1.close();
    }    
}

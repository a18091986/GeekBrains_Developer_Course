import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_2 {

    public void Task_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел будет в массиве?");
        int size = sc.nextInt();
        int [] input_array = new int [size];
        System.out.println("Введите последовательность чисел");
        for (int i = 0; i < input_array.length; i++)
            input_array[i] = sc.nextInt();
        sc.close();
        input_array = sort(input_array);
        System.out.println(input_array.toString());
        Logger logger = Logger.getLogger("test");
        logger.log(Level.INFO, input_array.toString());
//        log.info("test");
    }

    public int [] sort(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

}

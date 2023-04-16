import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class Task_2 {

    public void Tsk2() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел будет в массиве?");
        int size = sc.nextInt();
        int [] input_array = new int [size];
        System.out.println("Введите последовательность чисел");
        for (int i = 0; i < input_array.length; i++)
            input_array[i] = sc.nextInt();
        sc.close();
        input_array = sort(input_array);

       Logger logger = Logger.getLogger(Task_2.class.getName());
//        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log_task_2.log");
        logger.addHandler(fh);
//        XMLFormatter xml = new XMLFormatter();
        SimpleFormatter sf = new SimpleFormatter();
//        ch.setFormatter(xml);
        fh.setFormatter(sf);
        logger.log(Level.INFO, Arrays.toString(input_array));


    }

    public int [] sort(int[] arr) {
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

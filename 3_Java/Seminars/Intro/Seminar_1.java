import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Seminar_1
 */
public class Seminar_1 {
    public static void main(String[] args) {
        System.out.println("Hello world");     
        System.out.println(LocalDateTime.now());
        
        // Написать программу, которая запросит у пользователя имя в консоли и выведет в консоль сообщение привет, Имя!
        // System.out.println("---------------------------------------\n");
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("input your name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        // System.out.println("---------------------------------------\n");
        // int arr [] = {1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1};
        // int max_count = 0;
        // int current_count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 1) current_count += 1;
        //     else current_count = 0;
        //     if (current_count > max_count) max_count=current_count;
        // }
        // System.out.printf("Max 1 count: %d", max_count);

        // Ввести массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        
        System.out.println("---------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int array_size = sc.nextInt();
        int arr [] = new int [array_size];


        for (int i = 0; i < array_size; i++) {
            System.out.print("Ввести 1 или 0: ");
            arr[i] = sc.nextInt();
        }
               
        int max_count = 0;
        int current_count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) current_count += 1;
            else current_count = 0;
            if (current_count > max_count) max_count=current_count;
        }
        System.out.printf("Max 1 count: %d", max_count);
    }
}



    
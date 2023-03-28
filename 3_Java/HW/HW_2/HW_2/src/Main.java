import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Task_1 tk1 = new Task_1();
        System.out.println(tk1.Task_1());

        Task_4 tk4 = new Task_4();
        tk4.Task_4();

        Task_2 tk2 = new Task_2();
        tk2.Task_2();

//        SecondTask secondTask = new SecondTask();
//        System.out.println(secondTask.getUniqSequence());

//        ThirdTask thirdTask = new ThirdTask();
//        Scanner in = new Scanner(System.in);
//        String string = in.next();
//        in.close();
//        thirdTask.getResult(string);
//        System.out.println(isPalindromeAnotherMethod(string));

        FourthTask fourthTask = new FourthTask();
        try {
            fourthTask.writer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static Boolean isPalindromeAnotherMethod(String string) {
//        return string.equals((new StringBuilder(string)).reverse().toString());
//    }
}

/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */
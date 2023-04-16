import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбери номер задачи:\n" +
                "1 - парсинг json в sql запрос\n" +
                "2 - сортировка с выводом в лог\n" +
                "3 - калькулятор с логированием\n" +
                "4 - парсинг списка json с подстановкой в шаблон\n");
        switch (sc.nextInt()) {
            case 1 -> {
                Task_1 tk1 = new Task_1();
                System.out.println(tk1.Task_1());
            }
            case 2 -> {
                Task_2 tk2 = new Task_2();
                tk2.Tsk2();
            }
            case 3 -> {
                Task_3 tk3 = new Task_3();
                tk3.Tsk3();
            }
            case 4 -> {
                Task_4 tk4 = new Task_4();
                tk4.Task_4();
            }
        }
    }
}


import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_3 {
    public Task_3() throws IOException {
        Logger logger = Logger.getLogger(Task_3.class.getName());
        FileHandler fh = new FileHandler("log_task_3.log");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
    }

    public void Tsk3() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число: ");
        int operator_1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Введи операцию: ");
        String operation = sc.nextLine();
        System.out.println("Введи второе число: ");
        int operator_2 = sc.nextInt();
        System.out.printf("%d %s %d = %f", operator_1, operation, operator_2,
                calculate_result(operator_1, operator_2, operation));
        sc.close();


    }
    public double calculate_result(int x, int y, String operation) throws IOException {
        StringBuilder msg = new StringBuilder();
        int result;
        Logger logger = Logger.getLogger(Task_3.class.getName());
        switch (operation) {
            case "+": {
                result = x + y;
                break;
            }
            case "-": {
                result = x - y;
                break;
            }
            case "*": {
                result = x * y;
                break;
            }
            case "/": {
                try {
                    result = x / y;
                } catch (ArithmeticException e) {
                    logger.log(Level.INFO, e.toString());
                    e.printStackTrace();
                    return 0;
                }
                break;
            }
            default:
                result = 0;
        };
        msg.append(x).append(" ").append(operation).append(" ").append(y).append(" = ").append(result);
        logger.log(Level.INFO, msg.toString());
        return result;
    }
}

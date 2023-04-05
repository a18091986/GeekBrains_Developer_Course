package src;

import java.util.Scanner;
import java.util.Stack;

public class Calc {
    public static void calc () {
        Stack <Double> results = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n###########################################################\n" +
                "В калькулятор добавьте возможность отменить последнюю операцию.");
        String step = "";
        do {
            System.out.println("\nДля произведения новых вычислений (2 операнда и оператор) введитe 'new'\n" +
                    "Для операции с результатом последних вычислений введите 'continue'\n" +
                    "Для удаления результата последней операции введите 'delete'\n" +
                    "Для выхода введите 'quite'\n");
            step = sc.nextLine();
            switch (step) {
                case "new" -> {
                    results.push(start_new_calculation());
                    System.out.println("Текущая история результатов вычислений: " + results);
                }
                case "continue" -> {
                    results.push(continue_calculation(results.peek()));
                    System.out.println("Текущая история результатов вычислений: " + results);
                }
                case "delete" -> {
                    if (results.empty()) {
                        System.out.println("История операций пуста");
                    } else {
                        results.pop();
                        System.out.println("Текущая история результатов вычислений: " + results);
                    }
                }
            }

        } while (!step.equals("quite"));
    }
    public static double start_new_calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое целое число: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Введи операцию: ");
        String operation = sc.nextLine();
        System.out.println("Введи второе целое число: ");
        int y = sc.nextInt();
        return switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> switch (y) {
                case 0 -> Double.NaN;
                default -> x / y;
            };
            default -> 0;
        };
    }
    public static double continue_calculation(double x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи операцию: ");
        String operation = sc.nextLine();
        System.out.println("Введи второе целое число: ");
        int y = sc.nextInt();
        return switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> switch (y) {
                case 0 -> Double.NaN;
                default -> x / y;
            };
            default -> 0;
        };
    }
}

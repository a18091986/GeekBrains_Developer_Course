package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int real = promptInt("Введите действительную часть: ");
            int imagine = promptInt("Введите мнимую часть: ");
            Calculable calculator = calculableFactory.create(real, imagine);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int real_ = promptInt("Введите действительную часть второго аргумента: ");
                    int imagine_ = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.multi(real_, imagine_);
                    continue;
                }
                if (cmd.equals("+")) {
                    int real_ = promptInt("Введите действительную часть второго аргумента: ");
                    int imagine_ = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.sum(real_, imagine_);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат \n" + result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

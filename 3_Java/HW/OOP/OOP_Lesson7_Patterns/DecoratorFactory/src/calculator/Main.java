package calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calcFactory = new CalcFactory(new LogConsole(), calculableFactory);
        ViewCalculator view = new ViewCalculator(calcFactory);
        view.run();
    }
}

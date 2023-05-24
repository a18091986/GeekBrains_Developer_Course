package calculator;

public class CalculatorLogger implements Calculable{
    private Logger log;
    private Calculable calc;

    public CalculatorLogger(Logger log, Calculable calc) {
        this.log = log;
        this.calc = calc;
        log.log("Первый аргумент = " + calc.getResult());
    }

    @Override
    public Calculable sum(int arg, int imagine) {
        log.log("Суммируем с числом с действительной частью %d и мнимой частью %d".formatted(arg, imagine));
        return calc.sum(arg, imagine);
    }

    @Override
    public Calculable multi(int arg, int imagine) {
        log.log("Умножаем на число с действительной частью %d и мнимой частью %d".formatted(arg, imagine));
        return calc.multi(arg, imagine);
    }

    @Override
    public String getResult() {
        String temp = calc.getResult();
        log.log("Получен результат: " + temp);
        return temp;
    }
}

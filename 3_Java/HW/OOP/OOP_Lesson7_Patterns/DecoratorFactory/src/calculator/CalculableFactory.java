package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int real, int imagine) {
        return new Calculator(real, imagine);
    }
}

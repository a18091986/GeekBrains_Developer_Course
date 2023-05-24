package calculator;

public class CalcFactory implements ICalculableFactory {

    private Logger log;
    private ICalculableFactory calculableFactory;

    public CalcFactory(Logger log, ICalculableFactory calculableFactory) {
        this.log = log;
        this.calculableFactory = calculableFactory;
    }

    @Override
    public Calculable create(int real, int imagine) {
        return new CalculatorLogger(log, calculableFactory.create(real, imagine));
    }
}

package calculator;

public interface Calculable {
    Calculable sum(int arg, int imagine);
    Calculable multi(int arg, int imagine);
    String getResult();
}

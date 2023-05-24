package calculator;

public final class Calculator implements Calculable {

    private int real;
    private int imagine;

    public Calculator(int real, int imagine) {
        this.imagine = imagine;
        this.real = real;
    }

    @Override
    public Calculable sum(int arg, int imagine) {
        this.real += arg;
        this.imagine += imagine;
        return this;
    }

    @Override
    public Calculable multi(int arg, int imagine) {
        int start_real = this.real;
        int start_imagine = this.imagine;

        this.real = start_real * arg - imagine * start_imagine;
        this.imagine = imagine * start_real + start_imagine * arg;
        return this;
    }

    @Override
    public String getResult() {
        return "Действительная часть: %d, мнимая часть: %d".formatted(this.real, this.imagine);
    }
}

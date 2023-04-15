public class Chips extends Product{
    private String vegetable;

    public Chips(String name, Integer cost, String vegetable) {
        super(name, cost);
        this.vegetable = vegetable;
    }

    @Override
    public String toString() {
        return String.format("%s, produced from %s", super.toString(), vegetable);
    }
}

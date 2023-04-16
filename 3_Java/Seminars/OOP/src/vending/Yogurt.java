public class Yogurt extends Product{

    private String flavor;

    public Yogurt(String name, Integer cost, String flavor) {
        super(name, cost);

        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + flavor;
    }
}

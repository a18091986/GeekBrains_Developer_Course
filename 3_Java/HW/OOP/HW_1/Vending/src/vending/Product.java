public class Product {
    private Integer cost;
    private String name;
    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, cost);
    }
}

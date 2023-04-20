package src;

public abstract class Animal implements Sayable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, say: %s, eat: %s", name, say(), feed());
    }
}

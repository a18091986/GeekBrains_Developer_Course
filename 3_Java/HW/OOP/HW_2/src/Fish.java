package src;

public abstract class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    public String feed() {
        return "plants";
    }
}

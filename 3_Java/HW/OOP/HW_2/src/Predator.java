package src;

public abstract class Predator extends Animal{

    public Predator(String name) {
        super(name);
    }

    public String feed() {
        return "meat";
    }
}

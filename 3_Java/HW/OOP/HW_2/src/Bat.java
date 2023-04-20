package src;

public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Bat, %s", super.toString());
    }

    @Override
    public int fly_speed() {
        return 70;
    }

    @Override
    public String say() {
        return "Weee";
    }
}

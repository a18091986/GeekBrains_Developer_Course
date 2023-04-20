package src;

public class Duck extends Herbivores implements Flyable, Walkable, Swimable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya";
    }

    @Override
    public String toString() {
        return String.format("Duck, %s", super.toString());
    }

    @Override
    public int fly_speed() {
        return 100;
    }

    @Override
    public int walk_speed() {
        return 10;
    }

    @Override
    public int swim_speed() {
        return 15;
    }
}

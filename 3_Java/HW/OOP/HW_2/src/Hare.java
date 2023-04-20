package src;

public class Hare extends Herbivores implements Walkable{
    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Firk";
    }

    @Override
    public String toString() {
        return String.format("Hair, %s", super.toString());
    }

    @Override
    public int walk_speed() {
        return 70;
    }
}

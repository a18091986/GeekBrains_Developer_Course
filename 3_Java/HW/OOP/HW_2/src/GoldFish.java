package src;

public class GoldFish extends Fish implements Swimable {
    public GoldFish(String name) {
        super(name);
    }
    @Override
    public String say() {
        return "Tssss";
    }

    @Override
    public int swim_speed() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("GoldFish, %s", super.toString());
    }
}

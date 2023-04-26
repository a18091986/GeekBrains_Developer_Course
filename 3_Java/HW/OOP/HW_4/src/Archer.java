import java.util.Random;

public class Archer extends Warrior<Bow, ShieldType_1> {
    public Archer(String name, Bow bow, ShieldType_1 sh, int healthPoint) {
        super(name, bow, sh, healthPoint);
    }

    int range() {
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s, ",super.toString());
    }
}

import java.util.Random;

public class Assasin extends Warrior <Knife, ShieldType_2>{
    public Assasin(String name, Knife knife, ShieldType_2 sh, int healthPoint) {
        super(name, knife, sh, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Assassin %s, ",super.toString());
    }
}

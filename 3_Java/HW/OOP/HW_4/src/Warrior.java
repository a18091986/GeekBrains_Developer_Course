import java.util.Random;

public abstract class Warrior <T extends Weapon, S extends Protect>{
    private String name;
    protected T weapon;
    protected S protect;
    private int healthPoint;

    public Warrior(String name, T weapon, S protect, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.protect = protect;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Shield: %s, healthPoint: %d", name, weapon, protect, healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public int save() {
        Random random = new Random();
        return random.nextInt(protect.save());
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public T getWeapon() {
        return weapon;
    }
    public S getProtect() {
        return protect;
    }
}

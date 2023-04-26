import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior>{
    List<T> team = new ArrayList<>();

    public Team<T> addWarrior (T warrior){
        team.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for (T item: team) {
            warriors.append(item)
                    .append("\n");
        }
        warriors.append(String.format("\nКомандная характеристика: \n------------------------\n"))
                .append(String.format("Количество жизни: %d\n", healthPoints()))
                .append(String.format("Количество урона: %d\n", getDamage()))
                .append(String.format("Минимальная защита: %d\n", minShield()))
                .append(String.format("Дальность стрельбы: %d\n", maxRange()));
        return warriors.toString();
    }

    public int healthPoints() {
        int res = 0;
        for (T item: team)
            res += item.getHealthPoint();
        return res;
    }

    public int getDamage() {
        int res = 0;
        for (T item: team)
            res += item.getWeapon().damage();
        return res;
    }

    public int maxRange() {
        int res = 0;
        for (T item: team)
            if (item instanceof Archer)
                if (res < ((Archer)item).range())
                    res = ((Archer)item).range();
        return res;
    }

    public int minShield() {
        int res = team.get(0).getProtect().save();
        for (T item: team)
            if (item.getProtect().save() < res)
                res = item.getProtect().save();
        return res;
    }
}

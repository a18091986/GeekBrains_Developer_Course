public class Battle {
    private final Warrior one;
    private final Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHealthPoint() > 0 && two.getHealthPoint() > 0) {
            int hitOne = one.hit();
            int saveTwo = two.save();
            System.out.printf("Первый воин нанес удар с силой %d\n", hitOne);
            System.out.printf("Щит второго воина уменьшил удар на %d\n", saveTwo);
            two.setHealthPoint(two.getHealthPoint() - hitOne + saveTwo);
            System.out.printf("Здоровье второго воина: %d\n", two.getHealthPoint());
            if (two.getHealthPoint() <= 0) {
                return one;
            }
            int hitTwo = two.hit();
            int saveOne = one.save();
            System.out.printf("Второй воин нанес удар с силой %d\n", hitTwo);
            System.out.printf("Щит первого воина уменьшил удар на %d\n", saveOne);
            one.setHealthPoint(one.getHealthPoint() - hitTwo + saveOne);
            System.out.printf("Здоровье первого воина: %d\n", one.getHealthPoint());
        }
        return two;
    }
}

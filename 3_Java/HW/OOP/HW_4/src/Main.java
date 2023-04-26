public class Main {

    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        archers.addWarrior(new Archer("Archer 1", new Bow(), new ShieldType_1(), 100))
                .addWarrior(new Archer("Archer 2", new Bow(), new ShieldType_1(), 100));

        Team<Assasin> assasins = new Team<>();
        assasins.addWarrior(new Assasin("Assasin 1", new Knife(), new ShieldType_2(),100))
                .addWarrior(new Assasin("Assasin 2", new Knife(), new ShieldType_2(), 100));

        System.out.println(archers);
        System.out.println(assasins);

        Battle battle = new Battle(new Archer("Archer 1", new Bow(), new ShieldType_1(), 100),
                new Assasin("Assasin 2", new Knife(), new ShieldType_2(),100));
        Warrior winner = battle.fight();
        System.out.println(winner);
    }
}

package src;

public class Main {
    public static void main (String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addAnimal(new Wolf("WolfKarl"))
                .addAnimal(new Hare("HarePetja"))
                .addAnimal(new Duck("DuckDonald"))
                .addAnimal(new Bat("BatMouse"))
                .addAnimal(new GoldFish("FishGoldy"));

        System.out.println("\n------------------Zoo---------------------\n");

        for (var item: zoo.getAnimals())
            System.out.println(item);

        System.out.println("\n------------------Talkers---------------------\n");

        for (var say: zoo.getSayable())
            System.out.println(say.say());

        System.out.println("\n------------------Walkers---------------------\n");

        for (var walk_item: zoo.walkables())
            System.out.printf("%s, speed: %d\n", walk_item.toString(), walk_item.walk_speed());

        System.out.println("\n------------------Flyers---------------------\n");

        for (var fly_item: zoo.flyables())
            System.out.printf("%s, speed: %d\n", fly_item.toString(), fly_item.fly_speed());

        System.out.println("\n------------------Swimers---------------------\n");

        for (var fly_item: zoo.swimables())
            System.out.printf("%s, speed: %d\n", fly_item.toString(), fly_item.swim_speed());

        System.out.println("\n------------------MaxWalkSpeed---------------------\n");
        System.out.printf("WalkWinner: %s\n", zoo.WalkWinner().toString());

        System.out.println("\n------------------MaxFlySpeed---------------------\n");
        System.out.printf("FlyWinner: %s\n", zoo.FlyWinner().toString());

        System.out.println("\n------------------MaxSwimSpeed---------------------\n");
        System.out.printf("SwimWinner: %s\n", zoo.SwimWinner().toString());
    }
}

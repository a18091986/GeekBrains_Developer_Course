public class Main {

    public static void main(String[] args) {
        CoffeeMachine c_m = new CoffeeMachine();
        c_m.addCoffeeProd(new Coffee(200, 200, 80, "americano"))
                .addCoffeeProd(new Coffee(200, 100, 80, "espresso"))
                .addCoffeeProd(new Coffee_with_milk(150, 200, 80, 20, "raf"))
                .addCoffeeProd(new Coffee_with_milk(100, 400, 80, 30, "cappuccino"));

        System.out.println(c_m);
        System.out.println(c_m.status());

        System.out.println("Готовим кофемашину к работе: ");
        c_m.addWater(700);
        c_m.addMilk(1000);
        c_m.addCoffee(1000);

        System.out.println(c_m.status());

        System.out.println("Продажа капуччино:\n");
        Coffee coffee = c_m.sellCoffee_with_milk(new Coffee_with_milk(
                100, 400, 80, 30, "cappuccino"));
        String result = (coffee != null) ? ("Ваш кофе:\n" + coffee.toString()) : ("Не могу приготовить");
        System.out.println(result);
        System.out.println(c_m.status());

        System.out.println("Продажа американо:\n");
        coffee = c_m.sellCoffee(new Coffee(200, 200, 80, "americano"));
        result = (coffee != null) ? ("Ваш кофе:\n" + coffee.toString()) : ("Не могу приготовить");
        System.out.println(result);
        System.out.println(c_m.status());

        System.out.println("Продажа американо:\n");
        coffee = c_m.sellCoffee(new Coffee(200, 200, 80, "americano"));
        result = (coffee != null) ? ("Ваш кофе:\n" + coffee.toString()) : ("Не могу приготовить");
        System.out.println(result);
        System.out.println(c_m.status());
    }
}

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffee_menu = new ArrayList<>();

    private int money_in_machine = 0;
    private int coffee_weight_in_machine_g = 0;
    private int water_volume_in_machine_ml = 0;

    private int milk_volume_in_machine_ml = 0;

    public CoffeeMachine addCoffeeProd(Coffee c) {
        coffee_menu.add(c);
        return this;
    }

    public CoffeeMachine addCoffee(int weight) {
        coffee_weight_in_machine_g += weight;
        return this;
    }

    public CoffeeMachine addWater(int volume) {
        water_volume_in_machine_ml += volume;
        return this;
    }

    public CoffeeMachine addMilk(int volume) {
        milk_volume_in_machine_ml += volume;
        return this;
    }

    public int getMoney_in_machine() {
        return this.money_in_machine;
    }

    public Coffee sellCoffee(Coffee c) {
        if (c.getVolume() < water_volume_in_machine_ml) {
            money_in_machine += c.getCost();
            water_volume_in_machine_ml -= c.getVolume();
            coffee_weight_in_machine_g -= 100;
            return c;
        } else
            return null;
    }

    public Coffee sellCoffee_with_milk(Coffee_with_milk c) {
        if ((sellCoffee(c) != null) && c.getMilkVolume() < milk_volume_in_machine_ml) {
            milk_volume_in_machine_ml -= c.getMilkVolume();
            return c;
        } else {
            money_in_machine -= c.getCost();
            water_volume_in_machine_ml += c.getVolume();
            coffee_weight_in_machine_g += 100;
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Coffee c : coffee_menu)
            result.append(c).append("\n");
        return String.format("""
                ------------------------------------
                Меню кофейного автомата: 
                %s------------------------------------
                """, result);
    }

    public String status() {
        return String.format("""
                        ------------------------------------
                        Состояние кофемашины:
                        масса зернового кофе: %d г
                        объем воды: %d мл
                        объем молока: %d мл
                        деньги: %d
                        ------------------------------------
                        """,
                coffee_weight_in_machine_g,
                water_volume_in_machine_ml,
                milk_volume_in_machine_ml,
                money_in_machine);

    }
}

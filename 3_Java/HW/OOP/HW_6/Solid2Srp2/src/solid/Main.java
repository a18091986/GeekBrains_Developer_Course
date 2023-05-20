package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.SaverToJSON;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Input input = new Input();
        Order order = input.inputFromConsole();
        SaverToJSON saver = new SaverToJSON("order.json", order);
        saver.save();
    }
}

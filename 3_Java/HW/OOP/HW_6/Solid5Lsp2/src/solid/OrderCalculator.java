package solid;

import solid.lsp.AbstractOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<AbstractOrder> {
    private List<AbstractOrder> orders = new ArrayList<>();

    public void add(AbstractOrder order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (AbstractOrder order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<AbstractOrder> iterator() {
        return orders.iterator();
    }
}

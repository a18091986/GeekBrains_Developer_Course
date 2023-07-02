package store;

import java.util.Collection;
import java.util.HashSet;

public class Store {

    private Collection orders = new HashSet<>();

    public boolean AddOrder (Order order) {
        return true;
    }

    public boolean RemoveOrder (int id) {
        return true;
    }

    public boolean paymentOrder (int id) {
        return true;
    }
}

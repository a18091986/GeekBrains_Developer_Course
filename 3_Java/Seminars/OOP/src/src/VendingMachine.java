import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();
    private int money_amount = 0;
    public VendingMachine addProduct(Product product) {
        list.add(product);
        return this;
    }
    public List<Product> getList() {
        return list;
    }


    public Product findProduct (String find_pr) {
        for (Product pr: getList())
            if (find_pr.equals(pr.getName()))
                return pr;
        return null;
    }

    public Product sellProduct(Product sell_product) {
        try {
            Product pr = findProduct(sell_product.getName());
//            if (pr != null) {
            money_amount += pr.getCost();
            getList().remove(pr);
            return pr;
//            }
//            return null;
        } catch (Exception e) {
            throw new RuntimeException("Product not found");
        }
    }

    public int getMoney_amount() {
        return money_amount;
    }
}

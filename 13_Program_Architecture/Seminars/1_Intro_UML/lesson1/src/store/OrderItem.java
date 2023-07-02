package store;

public class OrderItem {

    //region Private Fields
    private static int counter = 0;
    private final int id;
    private Product product;
    private int quantity;
    //endregion

    //region Public Properties
    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //endregion

    {
        id = ++counter;
    }

}

package solid.lsp;

public abstract class AbstractOrder {

    protected int price;
    protected int qnt;

    public AbstractOrder(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }
    public abstract int getAmount();

}

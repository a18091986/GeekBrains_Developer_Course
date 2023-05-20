package solid.lsp;

public class Order extends AbstractOrder{

    public Order(int qnt, int price) {
        super(qnt, price);
    }

    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}

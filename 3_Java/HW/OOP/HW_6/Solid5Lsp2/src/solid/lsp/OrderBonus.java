package solid.lsp;

public class OrderBonus extends AbstractOrder{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Бонус: Количество = %d, Цена = %d", qnt, price);
    }
}

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330))
                .addProduct(new Yogurt("Danone", 100, "sweet"))
                .addProduct(new Chips("ChipsProducer", 150, "carrot"));
        System.out.println("-----------------------------------------------");
        System.out.println("Start products: ");
        for (Product el : vendingMachine.getList())
            System.out.println(el);

        System.out.println("-----------------------------------------------");
        System.out.println("Found product " + vendingMachine.findProduct("cheese"));

        Product sold_product = vendingMachine.sellProduct(new Product("water", 10));
        String sell = (sold_product != null) ?
                String.format("%s продан. Денег в автомате: %d",
                        sold_product, vendingMachine.getMoney_amount()) :
                "Такого продукта нет в автомате";
        System.out.println("-----------------------------------------------");
        System.out.println(sell);

        try {
            sold_product = vendingMachine.sellProduct(new Product("wat", 10));
            sell = (sold_product != null) ?
                    String.format("%s продан. Денег в автомате: %d",
                            sold_product, vendingMachine.getMoney_amount()) :
                    "Такого продукта нет в автомате";
            System.out.println("-----------------------------------------------");
            System.out.println(sell);
        } catch (Exception e) {
            sell = "Такого продукта нет в автомате";
            System.out.println(e.getMessage());
        }


        System.out.println("-----------------------------------------------");
        System.out.println("End products: ");
        for (Product el : vendingMachine.getList())
            System.out.println(el);
    }
}


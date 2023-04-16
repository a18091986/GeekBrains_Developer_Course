public class Coffee_with_milk extends Coffee{
    private int milk_volume;

    public Coffee_with_milk(Integer cost, Integer volume, Integer temp,
                            int milk_volume, String title) {
        super(cost, volume, temp, title);

        this.milk_volume = milk_volume;
    }

    @Override
    public String toString() {
        return super.toString() + " + молоко: " + (milk_volume) + " мл";
    }

    public Integer getMilkVolume() {return this.milk_volume;}
}

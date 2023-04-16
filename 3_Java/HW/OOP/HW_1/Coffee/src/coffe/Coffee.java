public class Coffee {
    private Integer cost;
    private Integer volume;
    private Integer temp;
    private String title;



    public Coffee(Integer cost, Integer volume, Integer temp, String title) {
        this.cost = cost;
        this.volume = volume;
        this.temp = temp;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Кофе %s температура %d стоимость %d объем %d",
                this.title, this.temp, this.cost, this.volume);
    }

    public Integer getVolume() {return this.volume;}
    public Integer getCost() {return this.cost;}
}

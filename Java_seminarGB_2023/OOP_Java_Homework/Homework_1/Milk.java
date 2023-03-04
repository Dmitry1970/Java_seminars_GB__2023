public class Milk extends FoodProducts {
    private double percentageOfFat;
    private String expiry_date;

    public Milk(String name, double price, int quantity, String unit, String expiry_date, double percentageOfFat) {
        super(name, price, quantity, unit, expiry_date);
        this.expiry_date = expiry_date;
        this.percentageOfFat = percentageOfFat;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, срок годности: %s, процент жирности: %.1f",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.expiry_date,
                this.percentageOfFat);
    }
}

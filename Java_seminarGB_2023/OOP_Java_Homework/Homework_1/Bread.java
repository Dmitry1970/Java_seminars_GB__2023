public class Bread extends FoodProducts {
    private String flourType;

    public Bread(String name, double price, int quantity, String unit, String expiry_date, String flourType) {
        super(name, price, quantity, unit, expiry_date);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %s, количество: %d, единица измерения: %s, срок годности: %s, тип муки: %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.getExpiry_date(),
                this.flourType);
    }
}

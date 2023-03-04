public class FoodProducts extends Product {
    private String expiry_date;

    public FoodProducts(String name, double price, int quantity, String unit, String expiry_date) {
        super(name, price, quantity, unit);
        this.expiry_date = expiry_date;
    }

    public FoodProducts(String name, double price, int quantity, String unit) {
        super(name, price, quantity, unit);

    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public String toString() {
        return String.format(
                "Название: %s, цена продукта: %.2f, количество: %d, единица измерения: %s, срок годности: %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.expiry_date);
    }
}

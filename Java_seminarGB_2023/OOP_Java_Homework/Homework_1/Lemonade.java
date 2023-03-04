public class Lemonade extends FoodProducts {

    public Lemonade(String name, double price, int quantity, String unit, String expiry_date) {
        super(name, price, quantity, unit, expiry_date);
    }

    public String toString() {
        return String.format("Название: %s, цена: %.2f, количество: %d, единица измерения: %s, срок годности: %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.getExpiry_date());
    }
}

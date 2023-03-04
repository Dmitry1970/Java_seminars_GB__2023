public class Eggs extends FoodProducts {
    private int itemsInPack;

    public Eggs(String name, double price, int quantity, String unit, String expiry_date, int itemsInPack) {
        super(name, price, quantity, unit, expiry_date);
        this.itemsInPack = itemsInPack;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, срок годности: %s, количество в упаковке: %d",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.getExpiry_date(),
                this.itemsInPack);
    }
}

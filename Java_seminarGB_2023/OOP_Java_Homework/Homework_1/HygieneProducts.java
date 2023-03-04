public class HygieneProducts extends Product {
    private int itemsInPack;

    public HygieneProducts(String name, double price, int quantity, String unit, int itemsInPack) {
        super(name, price, quantity, unit);
        this.itemsInPack = itemsInPack;
    }

    public int getItemsInPack() {
        return itemsInPack;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, количество штук в упаковке: %d",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.itemsInPack);
    }
}

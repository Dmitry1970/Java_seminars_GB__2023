public class Masks extends HygieneProducts {

    public Masks(String name, double price, int quantity, String unit, int itemsInPack) {
        super(name, price, quantity, unit, itemsInPack);
    }

    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, количество штук в упаковке: %d",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.getItemsInPack());
    }
}

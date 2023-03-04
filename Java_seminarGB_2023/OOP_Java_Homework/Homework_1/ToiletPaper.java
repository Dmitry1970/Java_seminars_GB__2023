public class ToiletPaper extends HygieneProducts {
    private int numberOfLayers;

    public ToiletPaper(String name, double price, int quantity, String unit, int itemsInPack, int numberOfLayers) {
        super(name, price, quantity, unit, itemsInPack);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, количество в упаковке: %d, количество слоёв: %d",
                getName(), getPrice(), getQuantity(), getUnit(), getItemsInPack(), this.numberOfLayers);
    }
}

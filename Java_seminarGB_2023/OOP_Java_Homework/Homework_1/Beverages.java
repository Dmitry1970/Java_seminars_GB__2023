public class Beverages extends Product {
    private double volume;

    public Beverages(String name, double price, int quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %.2f, количество: %d, единица измерения: %s, объем: %.2f",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.volume);
    }

}

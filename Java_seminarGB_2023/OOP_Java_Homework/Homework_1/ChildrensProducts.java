public class ChildrensProducts extends Product {
    private int minimumAge;
    private String hypoallergenic;

    public ChildrensProducts(String name, double price, int quantity, String unit, int minimumAge,
            String hypoallergenic) {
        super(name, price, quantity, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }

    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, минимальный возраст: %d, гипоаллергенность: %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.minimumAge,
                this.hypoallergenic);
    }
}

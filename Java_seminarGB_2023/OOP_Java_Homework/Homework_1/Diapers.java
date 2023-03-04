public class Diapers extends ChildrensProducts {
    private int diaperSize;
    private double minimumWeight;
    private double maximumWeight;
    private String typeOfDiaper;

    public Diapers(String name, double price, int quantity, String unit, int minimumAge, String hypoallergenic,
            int diaperSize, double minimumWeight, double maximumWeight, String typeOfDiaper) {
        super(name, price, quantity, unit, minimumAge, hypoallergenic);
        this.diaperSize = diaperSize;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.typeOfDiaper = typeOfDiaper;

    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, едининца измерения: %s, минимальный возраст: %d, гипоаллергенность: %s, размер: %d, минимальный вес: %.2f, максимальный вес: %.2f, тип: %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), this.getMinimumAge(),
                this.getHypoallergenic(), this.diaperSize, this.minimumWeight, this.maximumWeight, this.typeOfDiaper);
    }

}

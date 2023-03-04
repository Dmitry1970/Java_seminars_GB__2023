public class Nipple extends ChildrensProducts {

    public Nipple(String name, double price, int quantity, String unit, int minimumAge, String hypoallergenic) {
        super(name, price, quantity, unit, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s, цена: %.2f, количество: %d, единица измерения: %s, минимальный возраст: %d, гипоаллергенность: %s",
                getName(), getPrice(), getQuantity(), getUnit(), getMinimumAge(), getHypoallergenic());
    }
}

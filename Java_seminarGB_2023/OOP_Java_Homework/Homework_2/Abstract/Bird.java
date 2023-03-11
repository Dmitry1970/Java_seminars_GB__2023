package OOP_Java_Homework.Homework_2.Abstract;

public abstract class Bird extends Animal {
    protected double flightHeight;

    protected Bird(double height, double weight, String eyesColor, double flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }

    protected Bird() {
    }

    public void fly() {
        System.out.printf("я лечу на %d метрах", flightHeight);
    }

    @Override
    public String toString() {
        return String.format("%s, высота полёта - %.2f", super.toString(), flightHeight);
    }

}

package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.Bird;

public class Stork extends Bird {

    public Stork(double height, double weight, String eyesColor, double flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public Stork() {

    }

    @Override
    public void makeSound() {
        System.out.println("Так-так-так-так");
    }

    @Override
    public String toString() {
        return String.format("Аист: %s", super.toString());
    }
}

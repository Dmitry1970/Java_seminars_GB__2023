package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.Bird;

public class Chicken extends Bird{

    public Chicken(double height, double weight, String eyesColor, double flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public Chicken() {
    }

    public void makeSound() {
        System.out.println("Кудах-тах-тах");
    }

    public String toString() {
        return "Курица: " + super.toString();
    }
}

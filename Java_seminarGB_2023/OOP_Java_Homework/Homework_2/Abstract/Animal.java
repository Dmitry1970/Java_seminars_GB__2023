package OOP_Java_Homework.Homework_2.Abstract;


import OOP_Java_Homework.Homework_2.Interfaces.Printable;
import OOP_Java_Homework.Homework_2.Interfaces.Soundable;

public abstract class Animal implements Soundable, Printable {

    protected double height;
    protected double weight;
    protected String eyesColor;

    public Animal(double height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public Animal() {
    }

    @Override
    public abstract void makeSound();

    @Override
    public String toString() {
        return String.format("рост - %.2f, вес - %.2f, цвет глаз - %s", height, weight, eyesColor);
    }
}

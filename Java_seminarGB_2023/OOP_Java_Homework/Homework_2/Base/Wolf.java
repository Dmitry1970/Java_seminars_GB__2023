package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.WildAnimal;

public class Wolf extends WildAnimal {
    private boolean isAlpha;

    public boolean getIsAlpha() {
        return this.isAlpha;
    }

    public Wolf(String habitat, String dateOfLocation, double height, double weight, String eyesColor, boolean isAlpha) {
        super(habitat, dateOfLocation, height, weight, eyesColor);
        this.isAlpha = isAlpha;
    }

    public Wolf() {

    }

    @Override
    public void makeSound() {
        System.out.println("Оуууууу");
    }

    @Override
    public String toString() {
        return String.format("Волк: %s, вожак стаи - ", super.toString(), this.isAlpha);
    }
}

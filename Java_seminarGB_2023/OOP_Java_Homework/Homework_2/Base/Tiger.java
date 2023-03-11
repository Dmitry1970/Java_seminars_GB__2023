package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(String habitat, String dateOfLocation, double height, double weight, String eyesColor) {
        super(habitat, dateOfLocation, height, weight, eyesColor);
    }

    public Tiger() {

    }

    @Override
    public void makeSound() {
        System.out.println("Ррррррррр");

    }

    @Override
    public String toString() {
        return String.format("Тигр: %s", super.toString());

    }
}


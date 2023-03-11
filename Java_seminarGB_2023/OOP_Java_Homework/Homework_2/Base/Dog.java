package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.Pet;

public class Dog extends Pet {
    protected boolean hasTraining;

    public Dog(String nickname, String breed, String vaccine, String coatColor, String dateOfBirth, double height,
               double weight, String eyesColor, boolean hasTraining) {
        super(nickname, breed, vaccine, coatColor, dateOfBirth, height, weight, eyesColor);
        this.hasTraining = hasTraining;
    }

    public Dog() {
    }

    public boolean getHasTraining() {
        return this.hasTraining;
    }

    public void getTrain() {
        if (hasTraining) {
            System.out.println("Дрессировка - изучает команды");
        }
    }

    public void showTenderness() {
        System.out.println("Я - собака. Я люблю своего хозяина");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public String toString() {
        return String.format("Собака:  %s, дрессировка - %b", super.toString(), hasTraining);
    }

}

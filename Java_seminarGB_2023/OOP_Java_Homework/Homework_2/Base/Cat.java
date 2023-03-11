package OOP_Java_Homework.Homework_2.Base;

import OOP_Java_Homework.Homework_2.Abstract.Pet;

public class Cat extends Pet {
    private String coat;

    public String getCoat() {
        return coat;
    }

    public Cat(String nickname, String breed, String vaccine, String coatColor, String dateOfBirth, double height, double weight, String eyesColor, String coat) {
        super(nickname, breed, vaccine, coatColor, dateOfBirth, height, weight, eyesColor);
        this.coat = coat;
    }

    public Cat() {
    }

    @Override
    public void showTenderness() {
        System.out.println("Я - кошка. Я люблю, когда хозяин меня гладит");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяяяяуууу");
    }

    @Override
    public String toString() {
        return "Кот: " + super.toString() + ", наличие шерсти - " + coat;
    }
}


package OOP_Java_Homework.Homework_2.Base;


import OOP_Java_Homework.Homework_2.Abstract.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Animal> animal = new ArrayList<>();

        animal.add(new Cat("Вася", "сиамская", "есть прививки", "светло-коричневый", "10 января 2020 года", 30.12, 6.25, "тёмные", "есть шерсть"));
        animal.add(new Tiger("влажные тропические леса", "12 июня 1936", 1.15, 300, "жёлтый"));
        animal.add(new Dog("Дружок", "дворняга", "привита", "черно-жёлтый", "25 августа 2015 года", 0.80, 5.50, "сине-фиолетовый", true));
        animal.add(new Wolf("лес", "18 декабря 2022 года", 0.90, 90.00, "голубой", true));
        animal.add(new Chicken(35.5, 2.50, "тёмные", 1.50));
        animal.add(new Stork(110.00, 3.50, "чёрный", 6400.00));


        for (Animal animal1 : animal) {
            System.out.println(animal1);
            System.out.print(", звук, который издаёт животное: ");
            animal1.makeSound();

        }
        System.out.println("\n================================\n");
        Zoo zoo = new Zoo();
        ConsoleMenu.menuOfAnimals(zoo);


    }
}

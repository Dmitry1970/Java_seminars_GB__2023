package OOP_Java_Homework.Homework_2.Base;


import OOP_Java_Homework.Homework_2.Abstract.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void deleteAnimal(int index) {
        this.animals.remove(index);
    }

    public void printAnimalsInfo(int index) {
        System.out.println(this.animals.get(index));
    }

    public void makeASound(int index) {
        animals.get(index).makeSound();
    }

    public void printAnimalTotalInfo() {
        for (Animal item : animals) {
            System.out.println(item.toString());
//            item.printInfo();
        }
    }

    public void makeSoundAllAnimals() {
        for (Animal item : animals) {
            item.makeSound();
        }
    }
}

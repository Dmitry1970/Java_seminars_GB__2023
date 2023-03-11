package OOP_Java_Homework.Homework_2.Base;

import java.util.Scanner;

import static java.lang.System.in;

public class ConsoleMenu {
    public static void menuOfAnimals(Zoo zoo) {
        while (true) {
            System.out.println("Консольное меню: \n1 - добавить новое животное в зоопарк,\n2 - убрать животное из " +
                    "зоопарка,\n3 - печатать информацию о животном(ввести номер),\n4 - печать информации о всех " +
                    "животных в зоопарке на данный момент,\n5 - животное, которое издаёт звук(ввести номер),\n6 - все" +
                    " животные, которые есть в зоопарке, издают звук,\n7 - выход\n");
            System.out.print("Введите пункт меню: ");
            Scanner scanner = new Scanner(in);
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("Выберите животное, которое нужно добавить: \n" +
                            "1 - кошка,\n2 - собака, \n3 - волк, \n4 - тигр, \n5 - курица, \n6 - аист, \n7 - " +
                            "вернуться в начало списка");
                    int type = scanner.nextInt();
                    switch (type) {
                        case 1:
                            zoo.addAnimal(new Cat());
                            break;
                        case 2:
                            zoo.addAnimal(new Dog());
                            break;
                        case 3:
                            zoo.addAnimal(new Wolf());
                            break;
                        case 4:
                            zoo.addAnimal(new Tiger());
                            break;
                        case 5:
                            zoo.addAnimal(new Chicken());
                            break;
                        case 6:
                            zoo.addAnimal(new Stork());
                            break;
                        case 7:
                            menuOfAnimals(zoo);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Введите индекс животного, которое нужно убрать из зоопарка: ");
                    int ind = scanner.nextInt();
                    zoo.deleteAnimal(ind);
                    break;
                case 3:
                    System.out.print("Введите индекс животного, которое нужно распечатать: ");
                    int ind1 = scanner.nextInt();
                    zoo.printAnimalsInfo(ind1);
                    break;
                case 4:
                    System.out.println("\n Печать информации обо всех животных: \n");
                    zoo.printAnimalTotalInfo();
                    break;
                case 5:
                    System.out.print("Введите индекс животного, которое будет издавать звук: ");
                    int ind2 = scanner.nextInt();
                    zoo.makeASound(ind2);
                    break;
                case 6:
                    System.out.println("Все животные, которые есть в зоопарке, издают звук: \n");
                    zoo.makeSoundAllAnimals();
                    break;
                case 7:
                    break;
                default:
                    menuOfAnimals(zoo);
                    break;
            }

        }
    }
}

package OOP_Java_Homework.Homework_2.Abstract;

public abstract class Pet extends Animal {
    public String nickname;
    public String breed;  // порода
    public String vaccine;
    public String coatColor;
    public String dateOfBirth;

    public abstract void showTenderness();

    public Pet(String nickname, String breed, String vaccine,
               String coatColor, String dateOfBirth, double height, double weight, String eyesColor) {
        super(height, weight, eyesColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccine = vaccine;
        this.coatColor = coatColor;
        this.dateOfBirth = dateOfBirth;
    }

    public Pet() {

    }

    public abstract void makeSound();

    public String toString() {
        return String.format("кличка - %s, порода - %s, наличие прививок - %s, цвет шерсти - %s, дата рождения - %s",
                nickname, breed, vaccine, coatColor, dateOfBirth, super.toString());
    }
}

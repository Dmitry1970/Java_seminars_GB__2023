package OOP_Java_Homework.Homework_2.Abstract;

public abstract class WildAnimal extends Animal {
    public String habitat;
    public String dateOfLocation;

    public WildAnimal(String habitat, String dateOfLocation, double height, double weight, String eyesColor) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;

    }

    public WildAnimal() {

    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return String.format("среда обитания - %s, дата нахождения - %s, %s", habitat,
                dateOfLocation, super.toString());
    }
}

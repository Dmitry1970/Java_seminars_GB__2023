package OOP_Java_Homework.Homework_3.Base;

import OOP_Java_Homework.Homework_3.Interfaces.Figure;
import OOP_Java_Homework.Homework_3.Interfaces.Perimeterable;

public abstract class Polygon implements Figure, Perimeterable {
    protected double[] sides;

    protected Polygon(double[] sides) {
        this.sides = sides;
    }

    public double perimeter() {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

}

package OOP_Java_Homework.Homework_3.Figures;

import OOP_Java_Homework.Homework_3.DataException;
import OOP_Java_Homework.Homework_3.Interfaces.Figure;
import OOP_Java_Homework.Homework_3.Interfaces.Lengthable;

public class Circle implements Figure, Lengthable {

    private double radius;

    public Circle(double radius) throws DataException {
        if (radius <= 0) {
            throw new DataException("Неправильный ввод значения радиуса. Радиус должен быть числом больше 0");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        double circleSquare = Math.PI * Math.pow(radius, 2);
        return circleSquare;
    }

    @Override
    public double lengthOfFigure() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString() {
        return "Круг:";
    }
}

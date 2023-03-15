package OOP_Java_Homework.Homework_3.Figures;

import OOP_Java_Homework.Homework_3.Base.Polygon;
import OOP_Java_Homework.Homework_3.DataException;
import OOP_Java_Homework.Homework_3.Interfaces.Figure;
import OOP_Java_Homework.Homework_3.Interfaces.Perimeterable;

public class Rectangle extends Polygon implements Figure, Perimeterable {

    public Rectangle(double length, double width) throws DataException {
        super(new double[]{length, width, length, width});
        if (length <= 0 || width <= 0) {
            throw new DataException("Неправильный ввод значения стороны. Любая из сторон должна быть больше 0");
        }
    }

    @Override
    public double perimeter() {
        return (sides[0] + sides[1]) * 2;
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return "Прямоугольник:";
    }
}

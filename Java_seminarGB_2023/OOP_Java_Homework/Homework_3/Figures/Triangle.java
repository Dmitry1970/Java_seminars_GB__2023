package OOP_Java_Homework.Homework_3.Figures;

import OOP_Java_Homework.Homework_3.Base.Polygon;
import OOP_Java_Homework.Homework_3.DataException;

public class Triangle extends Polygon {

    public Triangle(double a, double b, double c) throws DataException {
        super(new double[]{a, b, c});
        if (a + b < c || b + c < a || a + c < b || a < 0 || b < 0 || c < 0) {
            throw new DataException("Сумма любых двух сторон треугольника должна быть больше третьей стороны. Любая " +
                    "сторона треугольника должна быть больше 0");
        }
    }

    @Override
    public double area() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return "Треугольник:";
    }


}

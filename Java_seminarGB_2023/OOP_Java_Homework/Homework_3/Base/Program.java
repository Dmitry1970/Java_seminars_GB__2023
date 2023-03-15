package OOP_Java_Homework.Homework_3.Base;

import OOP_Java_Homework.Homework_3.AreaComparator;
import OOP_Java_Homework.Homework_3.DataException;
import OOP_Java_Homework.Homework_3.Figures.Circle;
import OOP_Java_Homework.Homework_3.Figures.Rectangle;
import OOP_Java_Homework.Homework_3.Figures.Square;
import OOP_Java_Homework.Homework_3.Figures.Triangle;
import OOP_Java_Homework.Homework_3.Interfaces.Figure;
import OOP_Java_Homework.Homework_3.Interfaces.Lengthable;
import OOP_Java_Homework.Homework_3.Interfaces.Perimeterable;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) throws DataException {

        List<Figure> figures = new ArrayList<>();

        try {
            figures.add(new Triangle(14, 14, 10));
        } catch (DataException e) {
            e.printStackTrace();
        }
        try {
            figures.add(new Rectangle(5, 7));
        } catch (DataException e) {
            e.printStackTrace();
        }
        try {
            figures.add(new Square(8));
        } catch (DataException e) {
            e.printStackTrace();
        }
        try {
            figures.add(new Circle(5));
        } catch (DataException e) {
            e.printStackTrace();
        }

        squareAndPerimeterCount(figures);

        System.out.println("Сортировка по площади:");
        figures.sort(new AreaComparator());

        /** 2-ой способ сортировки по площади */
//      figures.sort(Comparator.comparingDouble(Figure::area));

        squareAndPerimeterCount(figures);

        /** Методы добавления, удаления, изменения  */
        FiguresCollection figuresCollection = new FiguresCollection(figures);
        figuresCollection.addFigure(new Triangle(6, 4, 5));
        figuresCollection.deleteFigure(2);
        figuresCollection.changeFigure(0, new Square(4));

        squareAndPerimeterCount(figures);
    }

    public static void printFigureInfo(Figure figure) {
        System.out.println(figure);
        System.out.println(String.format("площадь: %.2f", figure.area()));

        if (figure instanceof Lengthable) {
            Lengthable lengthable = (Lengthable) figure;
            System.out.println(String.format("длина: %.2f", lengthable.lengthOfFigure()));
        }
        if (figure instanceof Perimeterable) {
            Perimeterable perimeterable = (Perimeterable) figure;
            System.out.println(String.format("периметр: %.2f", perimeterable.perimeter()));
        }
    }

    public static double allFiguresSquare(Figure figure) {
        return figure.area();
    }

    public static double allFiguresPerimeter(Figure figure) {
        double perimeterAllFigures = 0;
        if (figure instanceof Perimeterable) {
            Perimeterable perimeterable = (Perimeterable) figure;
            perimeterAllFigures += perimeterable.perimeter();
        }
        return perimeterAllFigures;
    }

    public static void squareAndPerimeterCount(List<Figure> figures) {
        double perimeter = 0;
        double square = 0;
        for (Figure item : figures) {
            printFigureInfo(item);
            perimeter += allFiguresPerimeter(item);
            square += allFiguresSquare(item);
        }
        System.out.printf("Периметр всех фигур - %.2f,\nПлощадь всех фигур - %.2f", perimeter, square);
        System.out.println("\n+++++++++++++++++++++++++");
    }
}




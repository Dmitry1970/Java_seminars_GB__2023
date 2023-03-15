package OOP_Java_Homework.Homework_3;

import OOP_Java_Homework.Homework_3.Interfaces.Figure;

import java.util.Comparator;

public class AreaComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure f1, Figure f2) {
        return Double.compare(f1.area(), f2.area());
    }

}

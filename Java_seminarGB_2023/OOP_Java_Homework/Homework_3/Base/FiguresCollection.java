package OOP_Java_Homework.Homework_3.Base;

import OOP_Java_Homework.Homework_3.Interfaces.Figure;

import java.util.List;

public class FiguresCollection {
    private List<Figure> figures;

    public FiguresCollection(List<Figure> figures) {
        this.figures = figures;
    }

    public void addFigure(Figure figure) {
        this.figures.add(figure);
    }

    public void deleteFigure(int index) {
        this.figures.remove(index);
    }

    public void changeFigure(int index, Figure figure) {
        this.figures.set(index, figure);
    }
}

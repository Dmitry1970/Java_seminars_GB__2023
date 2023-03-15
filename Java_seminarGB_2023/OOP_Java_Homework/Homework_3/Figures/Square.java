package OOP_Java_Homework.Homework_3.Figures;

import OOP_Java_Homework.Homework_3.DataException;

public class Square extends Rectangle {

    public Square(double length) throws DataException {
        super(length, length);
        if (length <= 0) {
            throw new DataException("Неправильный ввод значения стороны. Значение должно быть больше 0");
        }
    }

    @Override
    public String toString() {
        return "Квадрат:";
    }
}

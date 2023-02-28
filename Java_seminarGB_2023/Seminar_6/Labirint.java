import java.util.Random;
import java.util.Scanner;

public class Labirint {
    public static int chooseMethodOfCreateMatrix() {
        System.out.println("Выбери способ создания лабиринта: ");
        System.out.println("1 - рандомный, 2 - задать параметры");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[][] createMatrix(int number) {
        int row = 0;
        int column = 0;
        if (number == 1) {
            int min = 5;
            int max = 20;
            Random rnd = new Random();
            row = rnd.nextInt(max - min) + min;
            column = rnd.nextInt(max - min) + min;
            System.out.printf("строк - %d, столбцов - %d\n", row, column);

        } else if (number == 2) {
            System.out.print("Введите количество строк: ");
            Scanner scn = new Scanner(System.in);
            row = scn.nextInt();
            System.out.print("Введите количество столбцов: ");
            column = scn.nextInt();
        } else {
            System.out.println("Введите правильное число");
        }
        int[][] myMatrix = new int[row][column];
        return myMatrix;
    }

    public static int[][] fillMatrix(int[][] myArray) {
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == 0 || i == myArray.length - 1 || j == 0 || j == myArray[i].length - 1) {
                    myArray[i][j] = -1;  // стенка
                }
                if (i == myArray.length - 3 && j == myArray[i].length - 1) {
                    myArray[i][j] = 8; // выход
                } else if ((i == 1 && i < myArray.length) && (j == 1 && j < myArray[i].length)) {
                    myArray[i][j] = 2; // позиция кошки(старт)
                }
                System.out.printf("%4d", myArray[i][j]);
            }
            System.out.println();
        }
        return myArray;
    }
}

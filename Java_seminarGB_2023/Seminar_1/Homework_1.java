import java.util.Scanner;

// /Написать программу вычисления n-ого треугольного числа.

public class Homework_1 {
    public static void main(String[] args) {
    int myDigit = inputNumber();
    System.out.println("Треугольное число: " + printResult(triangleDigit(myDigit)));
    System.out.println("Рекурсивное число: " + recur(myDigit));
    }
    
// Ввод  n размера треугольного числа

public static int inputNumber () {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите размер треугольного числа: ");
    int num = sc.nextInt();
    return num;
}

// Вычисление n-ого треугольного числа

public static int triangleDigit(int number) {
    int triDigit = (number*(number + 1))/2;
    return triDigit;
}

// Печать результата
public static int printResult(int digit) {
    return digit;
}

//    2-ой способ(рекурсивный метод)

public static int recur (int numb) {
    if (numb == 1) {
        return 1;
    }
    return recur(numb-1) + numb;
}

}
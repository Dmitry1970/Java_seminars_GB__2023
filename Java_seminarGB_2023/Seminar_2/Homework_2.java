import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import java.util.Scanner;

import javax.sound.sampled.AudioFormat.Encoding;

public class Homework_2 {
    public static String result = " ";

    public static void main(String[] args) throws FileNotFoundException {
        writeDigits();
        System.out.println(Arrays.toString(readFile()));
        int[] newArray = readFile();
        if (newArray[0] != 0 && newArray[1] > 0) {
            writeResult(positivePower(newArray));
        } else if (newArray[0] != 0 && newArray[1] < 0) {
            writeResult(negativePower(newArray));
        } else if (newArray[0] != 0 && newArray[1] == 0) {
            writeResult(zeroPower(newArray));
        } else if (newArray[0] == 0 && newArray[1] == 0) {
            writeResult(allDIgitsAreZero(newArray));
        }
    }

    public static int inputDigit() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void writeDigits() throws FileNotFoundException {

        File file = new File("input.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print("a ");
        System.out.print("Введите число a: ");
        pw.println(inputDigit());
        pw.print("b ");
        System.out.print("Введите число b: ");
        pw.println(inputDigit());
        pw.close();
    }

    public static int[] readFile() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String line1 = scanner.nextLine();
        String[] words = line1.split(" ");
        String line2 = scanner.nextLine();
        String[] words2 = line2.split(" ");
        int[] array = new int[2];
        array[0] = Integer.parseInt(words[1]);
        array[1] = Integer.parseInt(words2[1]);
        scanner.close();
        return array;
    }

    public static String positivePower(int[] arr) {
        int num = 1;
        for (int i = 0; i < arr[1]; i++) {
            num *= arr[0];         
        }
         result = String.valueOf(num);
        return result;
    }

    public static String negativePower(int[] myArr) {
        double num = 1;
        for (int i = 0; i < myArr[1]; i++) {
            num /= myArr[0];

        }
        String result = String.valueOf(num);
        return result;
    }

    public static String zeroPower(int[] myArray) {
        int num = 1;
        result = String.valueOf(num);
        return result;
    }

    public static String allDIgitsAreZero(int[] newArr) {
        String num = " ";
        if (newArr[0] == 0 && newArr[1] == 0) {
            num = "Не определено";
        }
        result = num;
        return result;
    }

    public static void writeResult(String result) throws FileNotFoundException {

        File file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print(result);
        pw.close();
    }
}

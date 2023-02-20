// +Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        int sizeOfArray = sizeArray();
        int[] newArray = myArray(sizeOfArray);
        mergeSort(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int sizeArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = sc.nextInt();
        return size;
    }

    public static int[] myArray(int number) {
        int[] arr = new int[number];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void mergeSort(int[] myArray) {
        int n = myArray.length;
        if (n == 1) {
            return;
        }
        int middle = n / 2; // разбиваем массив на две части
        int[] left = new int[middle]; // от 0 до middle - левая часть массива
        int[] right = new int[n - middle]; // n - middle - правая часть массива
        for (int i = 0; i < middle; i++) {
            left[i] = myArray[i];
        }
        for (int i = middle; i < n; i++) {
            right[i - middle] = myArray[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(myArray, left, right);
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int l = leftArr.length;
        int r = rightArr.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < l && j < r) {
            if (leftArr[i] < rightArr[j]) {
                arr[index] = leftArr[i];
                i++;
                index++;
            } else {
                arr[index] = rightArr[j];
                j++;
                index++;
            }
        }

        for (int leftSide = i; leftSide < l; leftSide++) { // если левая часть массива больше правой
            arr[index++] = leftArr[leftSide];
        }
        for (int rightSide = j; rightSide < r; rightSide++) { // если правая часть массива больше левой
            arr[index++] = rightArr[rightSide];
        }
    }
}

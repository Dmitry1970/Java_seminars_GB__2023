package Seminar_4;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        int size = sizeOfArray();
        int[] myArray = createArray(size, 0, 20);
        System.out.println(Arrays.toString(myArray));
        heapSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static int sizeOfArray() {
        Random rnd = new Random();
        int number = rnd.nextInt(20);
        System.out.println("Размер массива: " + number);
        return number;
    }

    public static int[] createArray(int size, int min, int max) {
        int[] myArray = new int[size];
        Random rand = new Random(100);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt((max - min) + min);
        }
        return myArray;
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n); // построение первичного дерева
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int num) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int max = i;

        if (left < num && arr[left] > arr[max]) {
            max = left;
        }
        if (right < num && arr[right] > arr[max]) {
            max = right;
        }
        if (i != max) { // если какой-то из "детей" больше "родителя" - меняем местами
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, max, num); // мах элемент опускаем на место "ребёнка"
        }
    }
}

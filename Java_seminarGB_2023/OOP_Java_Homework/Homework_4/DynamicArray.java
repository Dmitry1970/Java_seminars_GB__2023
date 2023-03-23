import java.util.Arrays;

public class DynamicArray<T extends Comparable<T>> {

    private T[] array;
    private int arrLength;

    public DynamicArray() {
        this.array = (T[]) new Comparable[10];
        this.arrLength = 0;
    }

    public DynamicArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Размер массива не может быть меньше 0");
        }
        this.array = (T[]) new Comparable[size];
        this.arrLength = 0;
    }

    public int length() {
        return this.arrLength;
    }

    public boolean isEmpty() {
        return arrLength == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= this.arrLength) {
            throw new IndexOutOfBoundsException("Значение индекса должно быть в диапазоне от 0 до " + this.arrLength);
        }
        return this.array[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index >= this.arrLength) {
            throw new IndexOutOfBoundsException("Значение индекса должно быть в диапазоне от 0 до " + this.arrLength);
        }
        this.array[index] = item;
    }

    public void add(T item) {
        if (this.arrLength == this.array.length) {
            int newArrayLength = this.array.length * 2;
            this.array = Arrays.copyOf(this.array, newArrayLength);
        }
        this.array[this.arrLength++] = item;
    }

    public void add(int index, T item) {

        if (index < 0 || index > arrLength) {
            throw new IndexOutOfBoundsException("Значение индекса должно быть в диапазоне от 0 до " + this.arrLength);
        }
        if (this.arrLength == this.array.length) {
            int newArrayLength = this.array.length * 2;
            this.array = Arrays.copyOf(this.array, newArrayLength);
        }
        System.arraycopy(this.array, index, item, index + 1, this.arrLength - index);
        this.array[index] = item;
        this.arrLength++;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.arrLength) {
            throw new IndexOutOfBoundsException("Значение индекса должно быть в диапазоне от 0 до " + this.arrLength);
        }
        int movedNumber = this.arrLength - index - 1;
        if (movedNumber > 0) {
            System.arraycopy(this.array, index + 1, this.array, index, movedNumber);
        }
        this.array[--this.arrLength] = null;
    }

    public int indexOf(T item) {
        if (item == null) {
            for (int i = 0; i < this.arrLength; i++) {
                if (this.array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.arrLength; i++) {
                if (item.equals(this.array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void sort() {
        Arrays.sort(this.array, 0, this.arrLength);
    }

    @Override
    public String toString() {
        if (this.arrLength == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.arrLength - 1; i++) {
            sb.append(this.array[i]).append(", ");
        }
        sb.append(this.array[this.arrLength - 1]).append("]");
        return sb.toString();
    }
}

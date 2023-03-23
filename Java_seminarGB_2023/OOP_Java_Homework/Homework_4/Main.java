public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(6);
        array.add(3);
        array.add(5);
        System.out.println(array);
        array.sort();
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
    }

}

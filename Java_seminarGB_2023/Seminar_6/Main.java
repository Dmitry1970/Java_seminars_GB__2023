
public class Main {
    public static void main(String[] args) {
        Labirint.fillMatrix(Labirint.createMatrix(Labirint.chooseMethodOfCreateMatrix()));
        System.out.println("========================================");
        int[][] arr = Labirint.wallCreator();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

}

import java.util.Arrays;

public class Aplicacao {
    public static void main(String[] args) {
        int[][] array = new int[3][5];

        array[2][3] = 10;

        for (int[] i : array) {
            System.out.println(Arrays.toString(i));

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

    }
}
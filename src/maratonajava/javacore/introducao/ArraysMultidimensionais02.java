package maratonajava.javacore.introducao;

import java.util.Random;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        int[] arrayExemplo = {1, 2, 3, 4, 5, 6};
        arrayInt[2] = arrayExemplo;

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = random.nextInt(100);
            }
        }

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}

package cursojavaloiane.ExerciciosAulas20;

import java.util.concurrent.ThreadLocalRandom;

public class Ex_01 {
    public static void main(String[] args) {
        /* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
        9. Após isso determine o maior número da matriz e a sua posição
        (linha, coluna). */

        int[][] matrizM = new int[4][4];

        int maior = 0;
        int linha = 0;
        int col = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = ThreadLocalRandom.current().nextInt(100);
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        System.out.println();
        System.out.println("Maior número " + maior);
        System.out.println("linha " + linha);
        System.out.println("coluna " + col);
    }
}

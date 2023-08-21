package cursojavaloiane.ExerciciosAulas19;

public class Ex_05 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o respectivo elemento de A multiplicado por sua posição (ou
            índice), ou seja:
            B[i] = A[i] * i. */

        int[] vetorA = new int[10];

        vetorA[0] = 100;
        vetorA[1] = 200;
        vetorA[2] = 300;
        vetorA[3] = 400;
        vetorA[4] = 500;
        vetorA[5] = 600;
        vetorA[6] = 700;
        vetorA[7] = 800;
        vetorA[8] = 326;
        vetorA[9] = 1000;

        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor A, posição "+ i+ " recebe: "+ vetorA[i]);
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * i;

            System.out.println("Vetor B, posição "+ i+" recebe: valor de Vetor A: "+ vetorA[i]+ " x posição "+ i+ " = "+ vetorB[i]);
        }

    }
}
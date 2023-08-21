package cursojavaloiane.ExerciciosAulas19;

public class Ex_03 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o quadrado do respectivo elemento de A, ou seja:
            B[i] = A[i] * A[I]. */

        int[] vetorA = new int[15];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
        vetorA[10] = 11;
        vetorA[11] = 12;
        vetorA[12] = 13;
        vetorA[13] = 14;
        vetorA[14] = 15;

        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(i+1 +" posicão do Vetor A é: "+ vetorA[i]);
        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println(i+1 +" posicão do Vetor B é: "+ vetorB[i]);
        }
    }
}
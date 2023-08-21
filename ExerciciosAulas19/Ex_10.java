package cursojavaloiane.ExerciciosAulas19;

public class Ex_10 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
            seja: B[i] := A[i] % 2. */


        int[] vetorA = new int[10];

        vetorA [0] = 8;
        vetorA [1] = 17;
        vetorA [2] = 2;
        vetorA [3] = 44;
        vetorA [4] = 80;
        vetorA [5] = 98;
        vetorA [6] = 55;
        vetorA [7] = 854;
        vetorA [8] = 18;
        vetorA [9] = 24;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println((i+1)+ "º elemento do vetor A: "+ vetorA[i]);
        }
        System.out.println();

        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] % 2;
            System.out.println((i+1)+ "º elemento do vetor B: "+ vetorB[i]);
        }

    }
}
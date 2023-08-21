package cursojavaloiane.ExerciciosAulas19;


public class Ex_01 {
    public static void main(String[] args) {
        /* Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
            seja, B[i] = A[i]. */


        int[] A = new int[5];

        A[0] = 10;
        A[1] = 20;
        A[2] = 30;
        A[3] = 40;
        A[4] = 50;

        int[] B = A;

        for (int i = 0; i < A.length; i++){
            System.out.println(i+1 +" posição do vertor A é: " + A[i]);
        }
        System.out.println("---------------------------------------");

        for (int b = 0; b < B.length; b++){
            System.out.println(b+1 +" posição do vertor B é: " + B[b]);
        }

    }
}

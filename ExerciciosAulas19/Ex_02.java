package cursojavaloiane.ExerciciosAulas19;

public class Ex_02 {
    public static void main(String[] args) {
        /* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho e com os elementos do vetor A multiplicados
            por 2, ou seja: B[i] = A[i] * 2. */

        int[] A = new int[8];

        A[0] = 100;
        A[1] = 200;
        A[2] = 300;
        A[3] = 400;
        A[4] = 500;
        A[5] = 600;
        A[6] = 700;
        A[7] = 800;

        int[] B = new int[A.length];

         for (int i = 0; i < A.length; i++){
             System.out.println(i+1 +" posicao do vetor A é : "+ A[i]);
         }
        System.out.println();
         for (int i = 0; i < B.length; i++){
             B[i] = A[i] * 2;
             System.out.println(i+1 +" posicao do vetor B é : "+ B[i]);
         }
    }
}

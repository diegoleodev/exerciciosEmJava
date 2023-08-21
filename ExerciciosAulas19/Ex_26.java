package cursojavaloiane.ExerciciosAulas19;



public class Ex_26 {
    public static void main(String[] args) {
        /* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
            um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
            regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
            b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
            quando Ai for menor que Bi. */

        int[] vetorA = {10, 21, 30, 41 , 50, 61, 70, 81, 90, 12};

        int[] vetorB = {1, 42, 30, 62, 50, 67, 702, 136, 22, 12};

        int[] vetorC = new int[vetorB.length];

        for (int i = 0; i < vetorB.length; i++){
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }
            if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }
            if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }

        System.out.print("vetor A: ");
        for (int numA : vetorA){
            System.out.print(numA+ " ");
        }
        System.out.println();

        System.out.print("vetor B: ");
        for (int numB : vetorB){
            System.out.print(numB+ " ");
        }

        System.out.println();
        System.out.print("vetor C: ");
        for (int numC : vetorC){
            System.out.print(numC+ " ");
        }


    }
}

package cursojavaloiane.ExerciciosAulas19;


public class Ex_25 {
    public static void main(String[] args) {
        /* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
            a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
            quando Ai for ímpar. */


        int[] vetorA = {1, 5, 8, 3, 4, 10 ,7, 9, 6, 2};

        int vetorB[] = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }

        //
        System.out.print("Vetor A: ");
        for (int num : vetorA) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int num : vetorB) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

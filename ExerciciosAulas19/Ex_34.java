package cursojavaloiane.ExerciciosAulas19;

public class Ex_34 {
    public static void main(String[] args) {
        /* Criar um vetor A com 10 elementos inteiros. Escreva um programa que
            imprima cada elemento do vetor A e a relação de todos os pares de 0
            até o respectivo elemento.
 */

        int[] vetorA = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};


        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Elemento " + (i + 1) + " do vetor A: " + vetorA[i]);


            System.out.print("Pares de 0 até " + vetorA[i] + ": ");
            for (int j = 0; j <= vetorA[i]; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }
}

package cursojavaloiane.ExerciciosAulas19;

import java.util.Scanner;

public class Ex_29 {
    public static void main(String[] args) {
        /* Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
            sendo este a junção dos dois outros vetores. Os primeiros 10
            elementos de C deverão receber os elementos de A e os últimos
            elementos C deverão receber os elementos de B. Desta forma, C
            deverá ter o dobro de elementos de A e B, ou seja, 20 elementos */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        int tamanhoVetor = vetorA.length;
        System.out.println("Entre com os "+ tamanhoVetor+ " elementos do vetor A e o vetor B...");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o "+ (i+1)+" elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.print("Digite o "+ (i+1)+" elemento do vetor B: ");
            vetorB[i] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }

        System.out.println();
        System.out.print("Elementos do vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.print("Elementos do vetor C: ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i]+" ");
        }


    }
}

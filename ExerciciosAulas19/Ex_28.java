package cursojavaloiane.ExerciciosAulas19;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_28 {
    public static void main(String[] args) {
        /* Ler um vetor A com 10 elementos e construir um vetor B de mesmo
            tipo e tamanho e com os mesmos elementos de A, sendo que estes
            deverão estar invertidos, ou seja, o primeiro elemento de A passa a
            ser o último de B, o segundo elemento de A passa a ser o penúltimo
            de B e assim por diante. */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];


        int tamanhoVetor = vetorA.length;
        System.out.println("Entre com os "+ tamanhoVetor+ " elementos do vetor A...");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o "+ (i+1)+" elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
        }


        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }


        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B (invertido): ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}

package cursojavaloiane.ExerciciosAulas19;

import java.util.Scanner;

public class Ex_30 {
    public static void main(String[] args) {
        /* Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
            que nos vetor B e C serão armazenados o valores pares e ímpares de
            A, respectivamente. */

        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;

        int[] vetorA = new int[tamanhoVetor];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o "+ (i+1)+" elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println();
        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }

        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];
        System.out.println();

        System.out.print("Elementos do vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorB[i] = vetorA[i];
                System.out.print(vetorB[i] +" ");
            }
        }
        System.out.println();
        System.out.print("Elementos do vetor C: ");
        for (int i = 0; i < vetorB.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorC[i] = vetorA[i];
                System.out.print(vetorC[i] +" ");
            }
        }
    }
}

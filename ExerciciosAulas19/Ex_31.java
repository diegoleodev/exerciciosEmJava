package cursojavaloiane.ExerciciosAulas19;

import java.util.Scanner;

public class Ex_31 {
    public static void main(String[] args) {
        /* Ler um vetor A com 20 elementos. Separar os elementos pares e
        ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
        do vetor B armazene os elementos pares de A e nas posições
        restantes do vetor B armazene os elementos de A que são ímpares */

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

        System.out.println();
        System.out.print("Elementos do vetor B: ");
        for (int i = 0; i < vetorA.length; i++){
           if (vetorA[i] % 2 == 0){
               vetorB[i] = vetorA[i];
               System.out.print(vetorB[i]+" ");
           }
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorB[i] = vetorA[i];
                System.out.print(vetorB[i]+" ");
            }
        }
    }
}

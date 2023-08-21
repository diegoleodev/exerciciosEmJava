package cursojavaloiane.ExerciciosAulas19;

import java.awt.*;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        /*  Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
            um vetor C, onde cada elemento de C é a subtração dos respectivos
            elementos em A e B, ou seja:
            C[i] = A[i] – B[i]. */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){

            System.out.print("Entre com o valor da posição "+ i+ " do vetor A: ");
            vetorA[i] = scan.nextInt();

            System.out.print("Entre com o valor da posição "+ i+ " do vetor B: ");
            vetorB[i] = scan.nextInt();

        }
        System.out.print("vetor A : ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();
        System.out.print("vetor B : ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.print("vetor C : ");
            System.out.println("posicão "+ i +": "+ vetorA[i]+ " - "+ vetorB[i]+" = "+ vetorC[i]);
        }
    }
}
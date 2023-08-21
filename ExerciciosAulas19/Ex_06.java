package cursojavaloiane.ExerciciosAulas19;

public class Ex_06 {
    public static void main(String[] args) {
        /*  Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
            um vetor C, onde cada elemento de C é a soma dos respectivos
            elementos em A e B, ou seja:
            C[i] = A[i] + B[i]. */


        int[] vetorA = new int[10];


        vetorA [0] = 10;
        vetorA [1] = 20;
        vetorA [2] = 30;
        vetorA [3] = 40;
        vetorA [4] = 50;
        vetorA [5] = 60;
        vetorA [6] = 70;
        vetorA [7] = 80;
        vetorA [8] = 90;
        vetorA [9] = 100;


        int[] vetorB = new int[vetorA.length];

        vetorB [0] = 10;
        vetorB [1] = 100;
        vetorB [2] = 20;
        vetorB [3] = 200;
        vetorB [4] = 30;
        vetorB [5] = 300;
        vetorB [6] = 40;
        vetorB [7] = 400;
        vetorB [8] = 50;
        vetorB [9] = 500;


        for (int i = 0; i < vetorA.length; i++){

            System.out.println("indice "+ (i+1)+ " do vetor A : "+ vetorA[i]);
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++){

            System.out.println("indice "+ (i+1)+ " do vetor B : "+ vetorB[i]);

        }
        System.out.println();


        // O VetorC irá receber a soma dos indices do VetorA e VetorC.
        int[] vetorC = new int[vetorB.length];

        for (int i = 0; i < vetorC.length; i++ ){
            vetorC[i] = vetorA[i] + vetorB[i];

            System.out.println("VetorC: recebe o valor da soma dos indices "+(i+1)+" de Vetor A e VetorB: "+ vetorA[i]+ " + "+ vetorB[i]+ " = "+ vetorC[i]);
        }
    }
}
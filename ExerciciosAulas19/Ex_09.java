package cursojavaloiane.ExerciciosAulas19;

public class Ex_09 {
    public static void main(String[] args) {
        /*  Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
            um vetor C, onde cada elemento de C é a divisão dos respectivos
            elementos em A e B, ou seja:
            C[i] = A[i] / float(B[i]) */


        double[] vetorA = new double[10];


        vetorA [0] = 100;
        vetorA [1] = 204;
        vetorA [2] = 303;
        vetorA [3] = 402;
        vetorA [4] = 504;
        vetorA [5] = 605;
        vetorA [6] = 707;
        vetorA [7] = 880;
        vetorA [8] = 900;
        vetorA [9] = 100;


        double[] vetorB = new double[vetorA.length];

        vetorB [0] = 10;
        vetorB [1] = 20;
        vetorB [2] = 30;
        vetorB [3] = 40;
        vetorB [4] = 50;
        vetorB [5] = 60;
        vetorB [6] = 70;
        vetorB [7] = 80;
        vetorB [8] = 90;
        vetorB [9] = 32;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println((i+1)+ "º posição do vetor A: "+ vetorA[i]);
            System.out.println((i+1)+ "º posição do vetor B: "+ vetorB[i]);
        }
        System.out.println();

        double[] vetorC = new double[vetorB.length];

        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.println((i+1)+ "º posição do vetor C: "+ vetorA[i]+" ÷ "+vetorB[i]+"= "+ vetorC[i]);
        }
    }
}
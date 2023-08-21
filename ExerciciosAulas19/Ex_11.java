package cursojavaloiane.ExerciciosAulas19;

public class Ex_11 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a quantidade de elementos armazenados neste
            vetor que são pares. */


        int[] vetorA = new int[10];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;
        vetorA [5] = 444;
        vetorA [6] = 7;
        vetorA [7] = 8;
        vetorA [8] = 9;
        vetorA [9] = 10;

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                System.out.println((i+1)+ "º elemento do vetor A: "+ vetorA[i]+ " é par");
            }
        }


    }
}
package cursojavaloiane.ExerciciosAulas19;

public class Ex_12 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a soma de todos os elementos armazenados
            neste vetor */


        int[] vetorA = new int[10];

        vetorA [0] = 10;
        vetorA [1] = 10;
        vetorA [2] = 20;
        vetorA [3] = 20;
        vetorA [4] = 30;
        vetorA [5] = 30;
        vetorA [6] = 40;
        vetorA [7] = 40;
        vetorA [8] = 50;
        vetorA [9] = 50;




        int soma = 0, total=0;
        for (int i = 0; i < vetorA.length; i++){

            soma = vetorA[i];
            total += soma;

            System.out.println((i+1)+"º "+ vetorA[i]);
        }

        System.out.println("A soma de todos os elemento do vetor A: "+ total);



    }
}
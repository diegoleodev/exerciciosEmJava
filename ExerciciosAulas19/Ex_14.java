package cursojavaloiane.ExerciciosAulas19;

public class Ex_14 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a média aritmética simples dos elementos
            ímpares armazenados neste vetor */


        int[] vetorA = new int[11];

        vetorA [0] = 10;
        vetorA [1] = 15;
        vetorA [2] = 7;
        vetorA [3] = 9;
        vetorA [4] = 355;
        vetorA [5] = 10;
        vetorA [6] = 15;
        vetorA [7] = 7;
        vetorA [8] = 9;
        vetorA [9] = 12;
        vetorA [10] = 19;


        System.out.println();
        int numVezes = 0;
        double soma=0;
        System.out.print("Dados os "+vetorA.length+" numeros da lista:");

        int x = 0;
        do{
            if (x == 0){
                System.out.print(" "+ vetorA[x]);
            }else{
                System.out.print(", "+ vetorA[x]);
            }
            x++;
        }while (x < vetorA.length);


        System.out.println();

        for (int i = 0; i < vetorA.length; i++){
            double numImpar = vetorA[i] % 2;
            boolean verificacao = numImpar != 0;

            if (verificacao){
                soma += vetorA[i];
                System.out.println("ímpar: "+ vetorA[i]);
                numVezes++;
            }
        }
        System.out.println("-----------------------------------");

        double media = soma / numVezes;
        System.out.println("média dos elementos: "+ String.format("%.1f", media));

    }
}
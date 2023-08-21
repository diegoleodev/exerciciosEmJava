package cursojavaloiane.ExerciciosAulas19;

public class Ex_16 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Escrever um programa
            que calcule e escreva: a) a soma de elementos armazenados neste
            vetor que são inferiores a 15; b) a quantidade de elementos
            armazenados no vetor que são iguais a 15; e c) a média dos
            elementos armazenados no vetor que são superiores a 15. */


        int[] vetorA = new int[10];

        vetorA [0] = 16;
        vetorA [1] = 15;
        vetorA [2] = 17;
        vetorA [3] = 41;
        vetorA [4] = 20;
        vetorA [5] = 20;
        vetorA [6] = 15;
        vetorA [7] = 15;
        vetorA [8] = 91;
        vetorA [9] = 16;

        System.out.println();

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

        int soma = 0;
        System.out.println("soma dos elementos menores que 15: ");
        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] < 15){
                soma += vetorA[i];
            }

        }

        if (soma == 0){
            System.out.println(soma+ " numeros");
        }else{
            System.out.println(soma);
        }

        System.out.println();

        System.out.println("quantidade de elementos no vetor iguais a 15: ");
        double quantidade =0;
        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] == 15){
                quantidade++;
            }
        }
        System.out.println(String.format("%.0f", quantidade));


        System.out.println();

        double media=0, soma2=0;
        double quantidade2 =0;
        System.out.println("média dos elementos armazenados no vetor que são superiores a 15: ");
        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] > 15){
                soma2 += vetorA[i];
                quantidade2++;

            }
        }
        media = soma2 / quantidade2;
        System.out.println(media);


    }
}
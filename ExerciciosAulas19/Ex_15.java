package cursojavaloiane.ExerciciosAulas19;

public class Ex_15 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
            que defina o percentual de elementos pares e ímpares,
            respectivamente, armazenados neste vetor */


        int[] vetorA = new int[10];

        vetorA [0] = 10;
        vetorA [1] = 23;
        vetorA [2] = 30;
        vetorA [3] = 41;
        vetorA [4] = 50;
        vetorA [5] = 60;
        vetorA [6] = 57;
        vetorA [7] = 81;
        vetorA [8] = 91;
        vetorA [9] = 102;


        int contadorImpar=0, contadorPar=0;
        double porcentagemImpar=0, porcentagempar=0;

        double quantNumEmDouble = vetorA.length;

        for (int i = 0; i < vetorA.length; i++){
            double numPar = vetorA[i] % 2;
            boolean verificacao = numPar == 0;

            if (verificacao){
                System.out.println("par: "+ vetorA[i]);
                contadorPar++;
                porcentagempar = (contadorPar/ quantNumEmDouble)*100;
            }else{
                System.out.println("impar: "+ vetorA[i]);
                contadorImpar++;
                porcentagemImpar = (contadorImpar/ quantNumEmDouble)*100;
            }
        }

        String porcentagemparFormatado = String.format("%.2f", porcentagempar);
        String porcentageImparFormatado = String.format("%.2f", porcentagemImpar);

        System.out.println("-------------------------------------------");
        System.out.println("De "+ vetorA.length+ " numeros: ");
        System.out.println(porcentagemparFormatado+"% de numeros pares e "+ porcentageImparFormatado+ "% de numeros ímpares.");
    }
}
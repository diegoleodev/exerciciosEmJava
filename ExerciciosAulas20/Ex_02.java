package cursojavaloiane.ExerciciosAulas20;

import java.util.concurrent.ThreadLocalRandom;

public class Ex_02 {
    public static void main(String[] args) {
        /* Gere e imprima uma matriz M 10x10 com valores aleatórios entre
        0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
        qual é o maior e o menor valor da coluna 7. */

        int[][] matrizM = new int[10][10];

        int linha5 = 0;
        int maiorNumLinha = 0;
        int menorNumLinha = 0;
        int maiorCol7=0;
        int menorCol7=0;
        int col7 = 0;

        System.out.print("colunas: ");
        for (int i =0; i < matrizM.length; i++ ){
            String numeroFormatado = String.format("%03d", i);
            System.out.print(numeroFormatado+"  ");
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < matrizM.length; i++){
            System.out.print("linha "+ i+ ": ");
            for (int j = 0; j < matrizM[i].length; j++){
                String numeroFormatado="";
                matrizM[i][j] = ThreadLocalRandom.current().nextInt(100);
                if (matrizM[i][j] < 100){
                     numeroFormatado = String.format("%03d", matrizM[i][j]);
                }else{
                     numeroFormatado = String.format("%02d", matrizM[i][j]);
                }

                System.out.print(numeroFormatado+ "  ");

                menorNumLinha = matrizM[5][j];
                menorCol7 = matrizM[i][7];
            }
            System.out.println();
        }

        for (int i = 0; i < 1; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                linha5 = matrizM[5][j];
                if (linha5 > maiorNumLinha){
                    maiorNumLinha = linha5;
                }
                if (menorNumLinha > linha5){
                    menorNumLinha = linha5;
                }


            }
            System.out.println();
        }

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < 1; j++){
                col7 = matrizM[i][7];
                if (col7 > maiorCol7){
                    maiorCol7 = col7;
                }
                if (menorCol7 > col7){
                    menorCol7 = col7;
                }
            }
        }

        System.out.println("Maior numero da linha 5: "+ maiorNumLinha);
        System.out.println("Menor numero da linha 5: "+ menorNumLinha);

        System.out.println("Maior numero da coluna 7: "+ maiorCol7);
        System.out.println("Menor numero da coluna 7: "+ menorCol7);

    }
}

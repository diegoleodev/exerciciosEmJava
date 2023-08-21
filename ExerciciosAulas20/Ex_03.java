package cursojavaloiane.ExerciciosAulas20;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_03 {
    public static void main(String[] args) {
        /* Capture do teclado valores para preenchimento de uma matriz M
        3x3. Após a captura imprima a matriz criada e encontre a
        quantidade de números pares, a quantidade de números ímpares */

        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++){
            System.out.println("Digite os "+ matrizM.length +" numeros da linha "+i+".");
            for (int j = 0; j < matrizM[i].length; j++){
                System.out.print("Digite: ");
                matrizM[i][j] = scan.nextInt();
            }
        }
        int contPar = 0;
        int contImpar = 0;
        for (int i = 0; i < matrizM.length; i++){
            System.out.print("linha "+ i+ ": ");
            for (int j = 0; j < matrizM[i].length; j++){
                if (matrizM[i][j] % 2 == 0){
                    contPar++;
                }else{
                    contImpar++;
                }
                System.out.print(matrizM[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Quantidade de numeros Pares: "+ contPar);
        System.out.println("Quantidade de numeros Ímpares: "+ contImpar);
    }
}

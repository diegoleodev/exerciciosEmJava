package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        /* Faça um programa que peça 10 números inteiros, calcule e mostre a
            quantidade de números pares e a quantidade de números impares. */
        Scanner scan = new Scanner(System.in);

        int i = 0, numero = 0;
        int contPar=0, contImpar=0;

        for (i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                contPar += +1;
            }else{
                contImpar += +1;
            }


        }
        System.out.println("-------------------------------------------");
        System.out.println("Quantidade de números pares: "+ contPar);
        System.out.println("Quantidade de números impares: "+ contImpar);
        System.out.println("-------------------------------------------");
    }
}

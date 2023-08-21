package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.*/

        System.out.print("Entre com um valor: ");
        int valor = scan.nextInt();

        if (valor < 0){
            System.out.println("Este valor é negativo");
        }else {
            System.out.println("Este valor é positivo");
        }

    }
}

package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        /* Faça um programa que receba dois números inteiros e gere os
            números inteiros que estão no intervalo compreendido por eles */
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com outro inteiro: ");
        int segundoNumero = scan.nextInt();

        int menor = Math.min(primeiroNumero, segundoNumero);
        int maior = Math.max(primeiroNumero, segundoNumero);

        System.out.println("----------------------------------------------------------");
        System.out.println("números inteiros que estão no intervalo de "+ menor+ " e "+ maior+": ");

        int i= 0;
        for (i = menor + 1; i < maior; i++ ){
            System.out.print(i+" ");
        }
    }
}

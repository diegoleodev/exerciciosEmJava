package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        /* .Faça um programa que peça dois números, base e expoente, calcule e
            mostre o primeiro número elevado ao segundo número. Não utilize a
            função de potência da linguagem */
        Scanner scan = new Scanner(System.in);

        System.out.print("digite a base: ");
        int base = scan.nextInt();
        System.out.print("digite o expoente: ");
        int expoente = scan.nextInt();

        int calc = 1;
        for (int i = 1; i <= expoente; i++ ){
            calc *= base;
        }
        System.out.println(base+ " elevado a "+ expoente+ " é igual a "+ calc);

    }
}

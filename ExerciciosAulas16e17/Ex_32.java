package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_32 {
    public static void main(String[] args) {
        /* Faça um programa que calcule o fatorial de um número inteiro
            fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
            conforme o exemplo abaixo:
            o Fatorial de: 5
            o 5! = 5 . 4 . 3 . 2 . 1 = 120 */
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scan.nextInt(); */

        int numero = 5;

        int fatorial = 1;
        String fatorialString = "";

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            fatorialString += i + (i > 1 ? " . " : " = ");
        }

        System.out.println("O Fatorial de: " + numero);
        System.out.println("O " + numero + "! = " + fatorialString + fatorial);
    }
}

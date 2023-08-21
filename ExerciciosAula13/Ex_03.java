package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        /* Faça um Programa que peça dois números e imprima a soma */

        Scanner scan = new Scanner(System.in);

        int number1, number2, soma;

        System.out.println("Digite um número: ");
        number1 = scan.nextInt();
        System.out.println("Digite mais um número: ");
        number2 = scan.nextInt();

        soma = number1 + number2;

        System.out.println("A soma dos número é igual a: " + soma);
    }
}

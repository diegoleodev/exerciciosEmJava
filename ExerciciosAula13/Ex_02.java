package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        /* Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número]. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um Número: ");
        int number = scan.nextInt();

        System.out.println("O número informado foi: " + number);
    }
}

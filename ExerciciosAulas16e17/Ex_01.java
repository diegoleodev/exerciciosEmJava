package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        /* Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        mensagem caso o valor seja inválido e continue pedindo até que o
        usuário informe um valor válido */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com uma nota: ");
        int nota = scan.nextInt();

        for (;nota >= 0 && nota > 11; nota++){
            System.out.println("valor inválido.");
            System.out.print("Entre com uma nota novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("valor válido, programa finalizado.");


    }
}

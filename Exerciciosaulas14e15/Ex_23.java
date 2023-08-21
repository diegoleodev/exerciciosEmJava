package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        /* Faça um Programa que peça um número e informe se o número é
            inteiro ou decimal. Dica: utilize uma função de arredondamento. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        double number = scan.nextDouble();

        double numeroArredondado = Math.round(number);

        if (numeroArredondado == number){
            System.out.println(number+ " é inteiro.");
        }else {
            System.out.println(number+ " é decimal.");
        }
    }
}

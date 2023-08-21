package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        /* Faça um Programa que peça um número inteiro e determine se ele é
            par ou impar. Dica: utilize o operador módulo (resto da divisão). */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um Número inteiro: ");
        int number = scan.nextInt();

        if (number % 2 == 0){
            System.out.println(number+ " é par.");
        }else {
            System.out.println(number+ " é impar.");
        }
    }
}

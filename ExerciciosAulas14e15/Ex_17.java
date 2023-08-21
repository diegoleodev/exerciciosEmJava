package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que peça um número correspondente a um
           determinado ano e em seguida informe se este ano é ou não bissexto. */

        System.out.print("Digite um número correspondente a um ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0 ){
            System.out.println(ano+ ": É um ano bissexto");
        }else {
            System.out.println(ano+ ": Não é um ano bissexto");
        }
    }
}

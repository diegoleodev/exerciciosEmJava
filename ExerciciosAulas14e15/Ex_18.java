package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        /* .Faça um Programa que peça uma data no formato dd/mm/aaaa e
            determine se a mesma é uma data válida. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int ano = scan.nextInt();

        if (dia < 1 || dia > 31 || mes > 12 || mes < 1 || ano < 1  ){
            System.out.println("A data é inválida.");
        }else{
            System.out.println("A data é válida.");
            System.out.println(dia+"/"+mes+"/"+ano);
        }
    }
}

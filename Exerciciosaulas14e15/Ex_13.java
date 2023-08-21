package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        /* Faça um Programa que leia um número e exiba o dia correspondente
            da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
            aparecer valor inválido. */
        Scanner scan =  new Scanner(System.in);

        System.out.print("Digite um número: ");
        int  numSemana = scan.nextInt();

        String diaSemana ;

        switch (numSemana){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia Inválido!";
                break;
        }
        System.out.println("Dia da semama: "+ diaSemana);
    }
}

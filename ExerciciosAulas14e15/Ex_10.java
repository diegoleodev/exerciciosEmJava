package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        /* Faça um Programa que pergunte em que turno você estuda. Peça
            para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
            mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
            Inválido!", conforme o caso. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda?");
        System.out.println("(M)Matutino  (V)Vespetino  (N)Noturno");
        System.out.print(": ");
        String turno = scan.nextLine();

        if (turno.equals("m") || turno.equals("M")){
            System.out.println("Bom dia!");
        }else if (turno.equals("v") || turno.equals("V")) {
            System.out.println("Bom tarde!");
        }else if(turno.equals("n") || turno.equals("N")){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Caracter não identificado!");
        }
    }
}

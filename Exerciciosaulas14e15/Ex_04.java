package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que verifique se uma letra digitada é vogal ou consoante*/

        System.out.print("Entre com uma letra: ");
        String letra = scan.nextLine();

        String vogal1 = "a";
        String vogal2 = "e";
        String vogal3 = "i";
        String vogal4 = "o";
        String vogal5 = "u";

        if (letra.equals(vogal1) || letra.equals(vogal2) || letra.equals(vogal3) || letra.equals(vogal4) || letra.equals(vogal5)){
            System.out.println(letra+ " é uma vogal");
        }else {
            System.out.println(letra+ " é uma consoante");
        }
    }
}

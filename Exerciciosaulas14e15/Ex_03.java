package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
            Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

        System.out.println("F: Feminino  M: Masculino");
        System.out.print("Digite uma letra: ");
        String letra = scan.nextLine();

        if (letra.equals("m")){
            System.out.println("Masculino");
        } else if (letra.equals("f")) {
            System.out.println("Feminino");
        }else {
            System.out.println("Sexo Invalido!");
        }


    }
}

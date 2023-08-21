package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        /* Faça um programa que leia 5 números e informe a soma e a média
        dos números. */
        Scanner scan = new Scanner(System.in);

        double i = 1, numeroMedia=0;
        double numero=0, numeroRecebido= 0, soma=0, media=0;
        while (i <= 5){
            System.out.print("Digite um numero: ");
            numero = scan.nextInt();
            soma = numeroRecebido += numero;
            numeroMedia = i;
            media = soma / numeroMedia;
            i++;
        }
        System.out.println("----------------------------");
        System.out.println("Soma dos Números: "+ String.format("%.0f", soma));
        System.out.println("Média: "+ media);
    }
}

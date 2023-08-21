package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Faça um programa que imprima na tela os números de 1 a 20, um
            abaixo do outro. Depois modifique o programa para que ele mostre os
            números um ao lado do outro. */

        int num;

        for (num = 0 ; num <= 20; num ++){
            System.out.println("Numero: "+ num);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Numeros um ao lado dos outro.");
        for (int numeroAoLado = 0; numeroAoLado <= 20; numeroAoLado++){
            System.out.print(numeroAoLado+ " - ");
        }
    }
}

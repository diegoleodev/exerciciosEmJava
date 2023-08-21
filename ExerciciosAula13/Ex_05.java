package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        /* Faça um Programa que converta metros para centímetros. */

        Scanner scan = new Scanner(System.in);

        double valorEmMetro, centimetros;

        System.out.println("CONVERSOR DE M PARA CM:");

        System.out.print("Metro: ");
        valorEmMetro = scan.nextDouble();

        centimetros = valorEmMetro * 100;

        System.out.println("Centímetro: " + centimetros + "cm");

    }
}

package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        /* Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. */

        Scanner scan = new Scanner(System.in);

        double raio, pi, area;

        System.out.print("Digite o raio de um circulo: ");
        raio = scan.nextDouble();

        pi = 3.14;

        area = pi * Math.pow(raio, 2);

        System.out.println("Área: " + area);
    }
}

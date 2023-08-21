package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que peça a temperatura em graus Celsius,
        transforme e mostre em graus Farenheit. */

        double grausCelsius, grausFahrenheit;

        System.out.println("Digite a temperatura em graus Celsius °C: ");
        grausCelsius = scan.nextDouble();

        grausFahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println("Graus Fahrenheit: " + grausFahrenheit+"°F");


    }
}

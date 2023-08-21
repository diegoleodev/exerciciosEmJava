package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        /* Faça um Programa que peça a temperatura em graus Farenheit,
        transforme e mostre a temperatura em graus Celsius.
        o C = (5 * (F-32) / 9)..*/
        Scanner scan = new Scanner(System.in);

        double grausFahrenheit, grausCelsius;

        System.out.print("Digite a temperatura em °F: ");
        grausFahrenheit = scan.nextDouble();

        grausCelsius = (grausFahrenheit - 32) / 1.8;
        System.out.println("Graus Celsius: " + grausCelsius+"°C");
    }
}

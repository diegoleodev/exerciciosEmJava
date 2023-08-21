package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        /* Tendo como dados de entrada a altura de uma pessoa, construa um
        algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
       (72.7*altura) - 58 */

        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;
        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso ideal: " + pesoIdeal+"kg");
    }
}

package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        /* Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário. */
        Scanner scan = new Scanner(System.in);

        double area, dobro;

        System.out.print("Digite a área de um quadrado: ");
        area = scan.nextDouble();

        area = Math.pow(area, 2);

        dobro = area * 2;

        System.out.println("ÁREA: "+ area);
        System.out.println("DOBRO DA ÁREA: "+ dobro);

    }
}

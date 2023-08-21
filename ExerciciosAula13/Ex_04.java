package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        /* Faça um Programa que peça as 4 notas bimestrais e mostre a média */

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println("A média das notas é: " + media);
    }
}

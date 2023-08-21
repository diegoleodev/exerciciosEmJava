package cursojavaloiane.Exerciciosaulas14e15;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        /* Faça um Programa que peça os 3 lados de um triângulo. O programa
            deverá informar se os valores podem ser um triângulo. Indique, caso
            os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
            escaleno.
                o Dicas:
                o Três lados formam um triângulo quando a soma de quaisquer
                dois lados for maior que o terceiro;
                o Triângulo Equilátero: três lados iguais;
                o Triângulo Isósceles: quaisquer dois lados iguais;
                o Triângulo Escaleno: três lados diferentes; */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado 1 do triângulo: ");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o lado 2 do triângulo: ");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o lado 3 do triângulo: ");
        double lado3 = scan.nextDouble();

        String triangulo = "";
        System.out.println("-----------------------------------------");
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 ){
            triangulo = "É UM TRIÂNGULO!";
            System.out.println(triangulo);

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É UM TRIÂNGULO EQUILÁTERO.");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É UM TRIÂNGULO ISÓSCELES.");
            }
            else {
                System.out.println("É UM TRIÂNGULO ESCALENO.");
            }

        }else {
            triangulo = "NÃO É UM TRIÂNGULO!";
            System.out.println(triangulo);
        }
        System.out.println("-----------------------------------------");
    }
}

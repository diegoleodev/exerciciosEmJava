package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        /* Faça um programa que calcule as raízes de uma equação do segundo
            grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
            b e c e fazer as consistências, informando ao usuário nas seguintes
            situações:
                a. Se o usuário informar o valor de A igual a zero, a equação não é
                do segundo grau e o programa não deve fazer pedir os demais
                valores, sendo encerrado;
                b. Se o delta calculado for negativo, a equação não possui raizes
                reais. Informe ao usuário e encerre o programa;
                c. Se o delta calculado for igual a zero a equação possui apenas
                uma raiz real; informe-a ao usuário;
                d. Se o delta for positivo, a equação possui duas raiz reais;
                informe-as ao usuário; */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scan.nextInt();
        if (a == 0){
            System.out.println("A equação não é do segundo grau quando a = 0");
        }
        else {
            System.out.print("Digite o valor de B: ");
            int b = scan.nextInt();
            System.out.print("Digite o valor de C: ");
            int c = scan.nextInt();

            System.out.println("-----------------------------------");
            System.out.println("a= "+ a + " b= "+ b + " c= "+ c);

            double bAoQuadrado = Math.pow(b, 2);
            String bFormat = String.format("%.0f", bAoQuadrado);
            double restoOperacao = -4*a*c;
            String restoFormat = String.format("%.0f", restoOperacao);


            double delta = (Math.pow(b, 2) )-4 * a * c;

            System.out.println("△ = -b²-4.a.c");
            System.out.println("△ = -" + b + "²" + "-4." + a + "." +c);
            System.out.println("△ = "+ bFormat +  restoFormat);
            System.out.println("△ = "+ delta);
            System.out.println("-----------------------------------");

            if (delta < 0){
                System.out.println("A equação não possui raizez reais, pois o delta calculado foi negativo.");
            } else if (delta == 0) {


            }
        }
    }
}

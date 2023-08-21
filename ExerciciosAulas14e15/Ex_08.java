package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        /* Faça um programa que pergunte o preço de três produtos e informe
            qual produto você deve comprar, sabendo que a decisão é sempre
            pelo mais barato. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro preço do produto: ");
        double primeiroPreco = scan.nextDouble();
        System.out.print("Digite o segundo preço do produto: ");
        double segundoPreco = scan.nextDouble();
        System.out.print("Digite o terceiro preço do produto: ");
        double terceiroPreco = scan.nextDouble();

        double menorPreco = primeiroPreco;

        if (segundoPreco < menorPreco){
            menorPreco = segundoPreco;
        }
        if (terceiroPreco < menorPreco){
            menorPreco = terceiroPreco;
        }

        System.out.println("Você deve comprar o produto com o valor de R$" +menorPreco+ " pois tem o menor preço.");

    }
}

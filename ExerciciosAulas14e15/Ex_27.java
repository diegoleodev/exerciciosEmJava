package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_27 {
    public static void main(String[] args) {
        /* .Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                Até 5 Kg                   Acima de 5 Kg
                Morango R$ 2,50 por Kg     R$ 2,20 por Kg
                Maçã R$ 1,80 por           Kg R$ 1,50 por Kg

                Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
                compra ultrapassar R$ 25,00, receberá ainda um desconto de
                10% sobre este total. Escreva um algoritmo para ler a
                quantidade (em Kg) de morangos e a quantidade (em Kg) de
                maças adquiridas e escreva o valor a ser pago pelo cliente. */
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade (em kg ) de morangos: ");
        double quantdadeKgMorangos = scan.nextDouble();
        System.out.println("Quantidade (em kg ) de maçãs: ");
        double quantdadeKgMaca = scan.nextDouble();

        double precoKgMorango = 0;
        double precoKgMaca = 0;
        double calculoMorango = 0;
        double calculoMaca = 0;
        double desconto = 0;

        if (quantdadeKgMorangos <= 5){
            precoKgMorango = 2.50;
        }
        if (quantdadeKgMorangos > 5){
            precoKgMorango = 2.20;
        }
        if (quantdadeKgMaca <= 5){
            precoKgMaca = 1.80;
        }
        if (quantdadeKgMaca > 5){
            precoKgMaca = 1.50;
        }

        calculoMorango = quantdadeKgMorangos * precoKgMorango;
        calculoMaca = quantdadeKgMaca * precoKgMaca;
        double total = calculoMorango + calculoMaca;
        double quantidadeKgFrutas = quantdadeKgMorangos + quantdadeKgMaca;

        System.out.println("---------------------------------------------------");
        if (quantidadeKgFrutas > 8 || total > 25){
            desconto = (total / 100) * 10 ;
            double totalComDesconto = total - desconto;

            System.out.println("valor a ser pago em "+ String.format("%.0f", quantdadeKgMorangos)+  "kg de morangos: R$"+ String.format("%.2f", calculoMorango));
            System.out.println("valor a ser pago em "+ String.format("%.0f", quantdadeKgMaca)+ "kg moçãs: R$"+ String.format("%.2f", calculoMaca));
            System.out.println("Quantidades de kilos em frutas: "+ String.format("%.0f", quantidadeKgFrutas)+ "kg");
            System.out.println("total a ser pago: R$"+ String.format("%.2f", total));
            System.out.println("Desconto: 10%");
            System.out.println("Total a ser pago com o desconto: R$"+ String.format("%.2f", totalComDesconto));
        }else{
            System.out.println("valor a ser pago em "+ String.format("%.0f", quantdadeKgMorangos)+  "kg de morangos: R$"+ String.format("%.2f", calculoMorango));
            System.out.println("valor a ser pago em "+ String.format("%.0f", quantdadeKgMaca)+ "kg moçãs: R$"+ String.format("%.2f", calculoMaca));
            System.out.println("Quantidades de kilos em frutas: "+ String.format("%.0f", quantidadeKgFrutas)+ "kg");
            System.out.println("total a ser pago: R$"+ String.format("%.2f", total));
        }
        System.out.println("---------------------------------------------------");

    }
}
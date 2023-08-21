package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {
        /* 6.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
            . Álcool:
                a. até 20 litros, desconto de 3% por litro
                b. acima de 20 litros, desconto de 5% por litro
            Gasolina:
                c. até 20 litros, desconto de 4% por litro
                d. acima de 20 litros, desconto de 6% por litro
            Escreva um   algoritmo que leia o número de litros vendidos, o tipo de
            combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
            sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
            do litro do álcool é R$ 1,90. */
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite (A) para álcool ou (G)para gasolina: ");
        String combustivel = scan.nextLine();

        Boolean a = combustivel.equals("a");
        Boolean A = combustivel.equals("A");
        Boolean g = combustivel.equals("g");
        Boolean G = combustivel.equals("G");

        if (a == false && A == false &&  g == false && G == false){
            System.out.println("Entrada inválida.");
        }else{
            System.out.print("Números de litros: ");
            double litros = scan.nextDouble();

            double litrosCombustivel = 0;
            double descontoPorLitro = 0;
            double total = 0;
            double porcentagemDesconto = 0;

            if (combustivel.equals("a") || combustivel.equals("A") ){
                combustivel = "Álcool";
                litrosCombustivel = 1.90;
                if (litros > 0 && litros <= 20){
                    porcentagemDesconto = 3;
                } else if (litros > 20) {
                    porcentagemDesconto = 5;
                }
            } else if (combustivel.equals("g") || combustivel.equals("G")) {
                combustivel = "Gasolina";
                litrosCombustivel = 2.50;
                if (litros > 0 && litros <= 20){
                    porcentagemDesconto = 4;

                } else if (litros > 20) {
                    porcentagemDesconto = 6;
                }
            }

            descontoPorLitro = (litrosCombustivel / 100) * porcentagemDesconto;
            litrosCombustivel = litrosCombustivel - descontoPorLitro;
            total = litrosCombustivel * litros;

            System.out.println("-------------------------------------");
            System.out.println("Combustível: "+ combustivel);
            System.out.println("Número de litros: "+ String.format("%.0f", litros));
            System.out.println("Desconto: "+  String.format("%.0f", porcentagemDesconto)+"%");
            System.out.println("Preço após desconto: R$"+ String.format("%.2f", litrosCombustivel));
            System.out.println("Total a ser pago: R$" + String.format("%.2f", total));

        }
    }
}

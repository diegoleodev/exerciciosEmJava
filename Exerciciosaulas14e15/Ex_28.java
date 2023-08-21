package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_28 {
    public static void main(String[] args) {
        /* .O Hipermercado Tabajara está com uma promoção de carnes que é
            imperdível. Confira:

                o Até 5 Kg Acima de 5 Kg
                o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
                o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
                o Picanha R$ 6,90 por Kg R$ 7,80 por Kg

                Para atender a todos os clientes, cada cliente poderá levar
                apenas um dos tipos de carne da promoção, porém não há
                limites para a quantidade de carne por cliente. Se compra for
                feita no cartão Tabajara o cliente receberá ainda um desconto
                de 5% sobre o total a compra. Escreva um programa que peça
                o tipo e a quantidade de carne comprada pelo usuário e gere
                um cupom fiscal, contendo as informações da compra: tipo e
                quantidade de carne, preço total, tipo de pagamento, valor do
                desconto e valor a pagar. */
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("Qual tipo de carne você deseja comprar? Obs: poderá levar apenas um dos tipos de carne da promoção.");
        System.out.print("(F) Filé Duplo (A) Alcatra (P) Picanha: ");
        String tipoCarne = scan.nextLine();

        Boolean f = tipoCarne.equals("f");
        Boolean F = tipoCarne.equals("F");
        Boolean a = tipoCarne.equals("a");
        Boolean A = tipoCarne.equals("A");
        Boolean p = tipoCarne.equals("p");
        Boolean P = tipoCarne.equals("P");

        String carne = "";
        double calculo = 0;
        double total = 0;
        double precoFileduplo = 0;
        double precoAlcatra = 0;
        double precoPicanha = 0;


        if (f == false && F == false &&  a == false && A == false &&  p == false && P == false) {
            System.out.println("Entrada inválida.");
        }else{
            if (f || F ){
                carne = "Filé Duplo";
            } else if (a || A) {
                carne = "Alcatra";
            }else if (p || P) {
                carne = "Picanha";
            }
            System.out.print("Quantidade (em kg) de "+ carne+ ": ");
            double quantidadeKgCarne = scan.nextDouble();
            System.out.print("Pagamento - (1) Dinheiro ou (2) Cartao Tabajara: ");
            int pagamento = scan.nextInt();

            if (quantidadeKgCarne <= 5){
                precoFileduplo = 4.90;
                precoAlcatra = 5.90;
                precoPicanha = 6.90;
            }
            if (quantidadeKgCarne > 5){
                precoFileduplo = 5.80;
                precoAlcatra = 6.80;
                precoPicanha = 7.80;
            }

            if (f || F ){
                calculo = quantidadeKgCarne * precoFileduplo;
            } else if (a || A) {
                calculo = quantidadeKgCarne * precoAlcatra;
            }else if (p || P) {
                calculo = quantidadeKgCarne * precoPicanha;
            }
            System.out.println("------------------------------------------");
            System.out.println("NOTA FISCAL: ");
            if (pagamento == 1) {
                System.out.println("Tipo de carne: "+ carne);
                System.out.println("Quantidade (em kg) comprados: "+ String.format("%.0f", quantidadeKgCarne)+ "kg");
                System.out.println("Tipo de pagamento: Dinheiro");
                System.out.println("Total a pagar: R$"+ String.format("%.2f", calculo));
            }else if (pagamento == 2 ){
                double desconto = (calculo / 100) * 5;
                total = calculo - desconto;
                System.out.println("Tipo de carne: "+ carne);
                System.out.println("Quantidade (em kg) comprados: "+ String.format("%.0f", quantidadeKgCarne)+ "kg");
                System.out.println("Tipo de pagamento: Cartão Tabajara");
                System.out.println("Desconto: 5%");
                System.out.println("Total a pagar: R$"+ String.format("%.2f", calculo));
                System.out.println("Total a pagar com o desconto: R$"+ String.format("%.2f", total));
            } else{
                System.out.println("inválido.");
            }
            System.out.println("------------------------------------------");
        }
    }
}

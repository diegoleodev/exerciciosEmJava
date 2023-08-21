package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_24 {
    public static void main(String[] args) {
        /* Faça um Programa que leia 2 números e em seguida pergunte ao
            usuário qual operação ele deseja realizar. O resultado da operação
            deve ser acompanhado de uma frase que diga se o número é:
                . par ou ímpar;
                a. positivo ou negativo;
                b. inteiro ou decimal. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer: ");
        System.out.print("(1)Para Adição (2)Para Subtração (3)Para Multiplicação (4)Para Divisão => : ");
        double operacao = scan.nextInt();

        if (operacao != 1 && operacao!= 2 && operacao!= 3 && operacao!= 4){
            System.out.println("Operação inválida.");
        }else {

            System.out.print("Entre com um número: ");
            double primeiroNumero = scan.nextDouble();
            System.out.print("Entre com outro número: ");
            double segundoNumero = scan.nextDouble();

            double calculo = 0;
            if (operacao == 1){
                calculo = primeiroNumero + segundoNumero;
            } else if (operacao == 2) {
                calculo  = primeiroNumero - segundoNumero;
            }else if (operacao == 3) {
                calculo  = primeiroNumero * segundoNumero;
            }else if (operacao == 4) {
                calculo  = primeiroNumero / segundoNumero;
            }

            String parOuImpar = "";
            String positivoOuNegativo = "";
            String inteitoOuDecicmal = "";

            if (calculo % 2 == 0){
                 parOuImpar = "par";
            }else {
                 parOuImpar = "ímpar";
            }

            if (calculo < 0){
                 positivoOuNegativo = "negativo";
            }else{
                 positivoOuNegativo = "positivo";
            }

            double numeroArredondado = Math.round(calculo);
            if (numeroArredondado == calculo){
                inteitoOuDecicmal = "inteiro";
            }else {
                 inteitoOuDecicmal = "decimal";
            }

            String calculoFormatado = String.format("%.1f", calculo);
            System.out.println("----------------------------------------------");
            System.out.println(calculoFormatado+ " é "+ parOuImpar+ ", "+positivoOuNegativo+ " e "+inteitoOuDecicmal);

        }
    }
}

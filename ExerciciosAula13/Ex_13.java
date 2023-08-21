package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        /* Faça um Programa que pergunte quanto você ganha por hora e o
            número de horas trabalhadas no mês. Calcule e mostre o total do seu
            salário no referido mês, sabendo-se que são descontados 11% para o
            Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
            programa que nos dê:
                . salário bruto.
                a. quanto pagou ao INSS.
                b. quanto pagou ao sindicato.
                c. o salário líquido.
                d. calcule os descontos e o salário líquido, conforme a tabela
                abaixo:*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor/hora: ");
        double valorHoras = scan.nextDouble();
        System.out.print("Entre com a quantidade de horas trabalhadas no mes: ");
        double quantidadeHoras = scan.nextDouble();

        double valorSalarioBruto = valorHoras * quantidadeHoras;
        double impostoDeRenda = (valorSalarioBruto / 100) * 11;
        double valorInss = (valorSalarioBruto / 100) * 8;
        double valorSindicato = (valorSalarioBruto / 100) * 5;
        double descontos  = impostoDeRenda + valorInss + valorSindicato;
        double valorSalarioLiquido = valorSalarioBruto - descontos;

        System.out.println("Salário Bruto: " + valorSalarioBruto);
        System.out.println("INSS: " + valorInss);
        System.out.println("Sindicato: " + valorSindicato);
        System.out.println("IR: " + impostoDeRenda);
        System.out.println("Total descontos: " + descontos);
        System.out.println("Salário Liquido: " + valorSalarioLiquido);




    }
}

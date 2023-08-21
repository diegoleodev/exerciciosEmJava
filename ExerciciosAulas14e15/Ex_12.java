package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        /* .Faça um programa para o cálculo de uma folha de pagamento,
            sabendo que os descontos são do Imposto de Renda, que depende do
            salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
            FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
            a empresa que deposita). O Salário Líquido corresponde ao Salário
            Bruto menos os descontos. O programa deverá pedir ao usuário o
            valor da sua hora e a quantidade de horas trabalhadas no mês.
                o Desconto do IR:
                o Salário Bruto até 900 (inclusive) - isento
                o Salário Bruto até 1500 (inclusive) - desconto de 5%
                o Salário Bruto até 2500 (inclusive) - desconto de 10%
                o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
                as informações, dispostas conforme o exemplo abaixo. No
                exemplo o valor da hora é 5 e a quantidade de hora é 220.
                Salário Bruto: (5 * 220) : R$ 1100,00
                (-) IR (5%) : R$ 55,00
                (-) INSS ( 10%) : R$ 110,00
                FGTS (11%) : R$ 121,00
                Total de descontos : R$ 165,00
                Salário Liquido : R$ 935,00 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor/hora: ");
        double valorHoras = scan.nextDouble();
        System.out.print("Entre com a quantidade de horas trabalhadas no mes: ");
        double quantidadeHoras = scan.nextDouble();
        double valorSalarioBruto = valorHoras * quantidadeHoras;

        double descontoIR = 0;
        double descontoInss = 0;
        double descontoFgts = 0;
        double totalDescontos = 0;
        double salarioLiquido = 0;

        if (valorSalarioBruto <= 900){
            descontoIR = 0 ;
        } else if (valorSalarioBruto > 900 && valorSalarioBruto <= 1500) {
            descontoIR = (valorSalarioBruto / 100) * 5;
        }else if (valorSalarioBruto > 1500 && valorSalarioBruto <= 2500) {
            descontoIR = (valorSalarioBruto / 100) * 10;
        }else {
            descontoIR = (valorSalarioBruto / 100) * 20;
        }

        descontoInss = (valorSalarioBruto / 100) * 10;
        descontoFgts = (valorSalarioBruto /100) * 11;
        totalDescontos = descontoIR + descontoInss;
        salarioLiquido = valorSalarioBruto - totalDescontos;

        System.out.println("");
        System.out.println("Salário bruto: R$" + String.format("%.2f", valorSalarioBruto));
        System.out.println("Dsconto de IR: R$" + String.format("%.2f", descontoIR));
        System.out.println("Dsconto INSS: R$" + String.format("%.2f", descontoInss));
        System.out.println("Dsconto de FGTS: R$" + String.format("%.2f", descontoFgts));
        System.out.println("Total de descontos: R$" + String.format("%.2f", totalDescontos));
        System.out.println("Salário Liquido: R$" + String.format("%.2f", salarioLiquido));

    }
}

package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        /* As Organizações Tabajara resolveram dar um aumento de salário aos
            seus colaboradores e lhe contraram para desenvolver o programa que
            calculará os reajustes.
            o Faça um programa que recebe o salário de um colaborador e o
            reajuste segundo o seguinte critério, baseado no salário atual:
                 salários até R$ 280,00 (incluindo) : aumento de 20%
                 salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
                 salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
                 salários de R$ 1500,00 em diante : aumento de 5% Após o
                 aumento ser realizado, informe na tela:
                 o salário antes do reajuste;
                 o percentual de aumento aplicado;
                 o valor do aumento;
                 o novo salário, após o aumento */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o salário atual: ");
        double salaroAtual = scan.nextDouble();
        int percentualAplicado;
        double aumentoAplicado = 0;
        double novoSalario = 0;
        System.out.println("=============================================");

        if (salaroAtual < 0){
            System.out.println("'Entre com um valor positivo.' ");
            percentualAplicado = 0;
            aumentoAplicado = (salaroAtual / 100) * percentualAplicado;
            novoSalario = salaroAtual + aumentoAplicado;
        }
        else if (salaroAtual <= 280){
            percentualAplicado = 20;
            aumentoAplicado = (salaroAtual / 100) * percentualAplicado;
            novoSalario = salaroAtual + aumentoAplicado;
        } else if (salaroAtual > 280 && salaroAtual <= 700) {
            percentualAplicado = 15;
            aumentoAplicado = (salaroAtual / 100) * percentualAplicado;
            novoSalario = salaroAtual + aumentoAplicado;
        } else if (salaroAtual > 700 && salaroAtual <= 1500) {
            percentualAplicado = 10;
            aumentoAplicado = (salaroAtual / 100) * percentualAplicado;
            novoSalario = salaroAtual + aumentoAplicado;
        }else {
            percentualAplicado = 5;
            aumentoAplicado = (salaroAtual / 100) * percentualAplicado;
            novoSalario = salaroAtual + aumentoAplicado;
        }

        System.out.println("Salário antes do ajuste: R$" + String.format("%.2f", salaroAtual));
        System.out.println("Percentual de aumento aplicado: "+ percentualAplicado+"%");
        System.out.println("Aumento aplicado: R$"+ String.format("%.2f", aumentoAplicado));
        System.out.println("Novo salário: R$" + String.format("%.2f", novoSalario));

        System.out.println("=============================================");
    }
}

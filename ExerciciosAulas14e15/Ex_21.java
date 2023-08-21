package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        /* .Faça um Programa para um caixa eletrônico. O programa deverá
            perguntar ao usuário a valor do saque e depois informar quantas notas
            de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
            10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
            reais. O programa não deve se preocupar com a quantidade de notas
            existentes na máquina.
                . Exemplo 1: Para sacar a quantia de 256 reais, o programa
                fornece duas notas de 100, uma nota de 50, uma nota de 5 e
                uma nota de 1;
                a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
                fornece três notas de 100, uma nota de 50, quatro notas de 10,
                uma nota de 5 e quatro notas de 1 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600): ");
        int valorSaque = scan.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O valor mínimo é 10 e o máximo é 600.");
        } else {
            int quantidadeNotas100 = valorSaque / 100;
            int valorRestante = valorSaque % 100;

            int quantidadeNotas50 = valorRestante / 50;
            valorRestante %= 50;

            int quantidadeNotas10 = valorRestante / 10;
            valorRestante %= 10;

            int quantidadeNotas5 = valorRestante / 5;
            valorRestante %= 5;

            int quantidadeNotas1 = valorRestante;

            System.out.println("Notas fornecidas:");
            if (quantidadeNotas100 > 0) {
                System.out.println(quantidadeNotas100 + " nota(s) de 100 reais");
            }
            if (quantidadeNotas50 > 0) {
                System.out.println(quantidadeNotas50 + " nota(s) de 50 reais");
            }
            if (quantidadeNotas10 > 0) {
                System.out.println(quantidadeNotas10 + " nota(s) de 10 reais");
            }
            if (quantidadeNotas5 > 0) {
                System.out.println(quantidadeNotas5 + " nota(s) de 5 reais");
            }
            if (quantidadeNotas1 > 0) {
                System.out.println(quantidadeNotas1 + " nota(s) de 1 real");
            }

        }
    }
}

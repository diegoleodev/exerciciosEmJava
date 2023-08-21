package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        /* .Faça um programa que lê as duas notas parciais obtidas por um aluno
            numa disciplina ao longo de um semestre, e calcule a sua média. A
            atribuição de conceitos obedece à tabela abaixo:
                o Média de Aproveitamento Conceito
                o Entre 9.0 e 10.0 A
                o Entre 7.5 e 9.0 B
                o Entre 6.0 e 7.5 C
                o Entre 4.0 e 6.0 D
                o Entre 4.0 e zero E
                O algoritmo deve mostrar na tela as notas, a média, o conceito
                correspondente e a mensagem “APROVADO” se o conceito for
                A, B ou C ou “REPROVADO” se o conceito for D ou E. */
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;
        String conceito;
        String mensagem = "";

        if (media >= 9 && media <= 10){
            conceito = "A";
            mensagem = "APROVADO";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            mensagem = "APROVADO";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            mensagem = "APROVADO";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            mensagem = "REPROVADO";
        } else if (media <= 4 && media > 0) {
            conceito = "E";
            mensagem = "REPROVADO";
        }else {
            conceito = "Nota inválida!";
        }

        System.out.println("PRIMEIRA NOTA: "+ primeiraNota);
        System.out.println("SEGUNDA NOTA: "+ segundaNota);
        System.out.println("MÉDIA: "+ media);
        System.out.println("CONCEITO: "+ conceito);
        System.out.println("RESULTADO: "+ mensagem);

    }
}

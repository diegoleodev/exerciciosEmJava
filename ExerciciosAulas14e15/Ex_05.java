package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um programa para a leitura de duas notas parciais de um aluno.
           O programa deve calcular a média alcançada por aluno e apresentar:
                o A mensagem "Aprovado", se a média alcançada for maior ou
                igual a sete;
                o A mensagem "Reprovado", se a média for menor do que sete;
                o A mensagem "Aprovado com Distinção", se a média for igual a
                dez.*/

        System.out.println("Entre com a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("Média: "+media);
        if (media >= 7 && media <= 9.99 ){
            System.out.println("APROVADO");
        } else if (media < 7) {
            System.out.println("REPROVADO");
        }else if (media == 10){
            System.out.println("APROVADO COM DISTINÇÃO");
        }
    }
}

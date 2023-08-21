package cursojavaloiane.Exerciciosaulas14e15;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        /* Faça um Programa para leitura de três notas parciais de um aluno. O
            programa deve calcular a média alcançada por aluno e presentar:
            . A mensagem "Aprovado", se a média for maior ou igual a 7,
            com a respectiva média alcançada;
                a. A mensagem "Reprovado", se a média for menor do que 7, com
                a respectiva média alcançada;
                b. A mensagem "Aprovado com Distinção", se a média for igual a 10. */
        Scanner scan  = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        String mediaF = String.format("%.2f", media);

        if (media >= 7 && media < 9){
            System.out.println("Média: "+ mediaF+ " Aprovado!");
        } else if (media < 7) {
            System.out.println("Média: "+ mediaF+ " Reprovado!");
        }else if (media == 10){
            System.out.println("Média: "+ mediaF+ " - Parabéns Aprovado com Distinção!");
        }else {
            System.out.println("Média inválida.");
        }
    }
}

package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        /* Faça um programa que faça 5 perguntas para uma pessoa sobre um
            crime. As perguntas são:
                . "Telefonou para a vítima?"
                a. "Esteve no local do crime?"
                b. "Mora perto da vítima?"
                c. "Devia para a vítima?"
                d. "Já trabalhou com a vítima?" O programa deve no final emitir
                uma classificação sobre a participação da pessoa no crime. Se
                a pessoa responder positivamente a 2 questões ela deve ser
                classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
                como "Assassino". Caso contrário, ele será classificado como
                "Inocente". */

        Scanner scan  = new Scanner(System.in);

        System.out.println("RESPONDA COM (S) PARA SIM E (N) PARA NÃO.");

        System.out.println("Telefonou para a vítima?");
        String primeiraQuestao = scan.nextLine();
        System.out.println("Esteve no local do crime?");
        String segundaQuestao = scan.nextLine();
        System.out.println("Mora perto da vítima?");
        String terceiraQuestao = scan.nextLine();
        System.out.println("Devia para a vítima?");
        String quartaQuestao = scan.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        String quintaQuestao = scan.nextLine();

        String letrasJuntas = (primeiraQuestao + segundaQuestao + terceiraQuestao + quartaQuestao + quintaQuestao);







    }
}

package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        /* .Faça um programa que peça o tamanho de um arquivo para download
        (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
        informe o tempo aproximado de download do arquivo usando este link
        (em minutos). */
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Entre com a velocidade da internet: ");
        double velocidade = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidade;
        System.out.println("Tempo de download: " + tempo);
    }
}

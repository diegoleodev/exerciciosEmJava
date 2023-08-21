package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        /* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês */
        Scanner scan = new Scanner(System.in);

        double quantoGanha, numHoras, total;

        System.out.print("Quanto você ganha por hora: ");
        quantoGanha = scan.nextDouble();
        System.out.print("Número de horas trabalhas: ");
        numHoras = scan.nextDouble();

        total = quantoGanha * numHoras;

        System.out.println("SALÁRIO TOTAL: "+ total+"R$");


    }
}

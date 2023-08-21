package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de
            crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
            Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
            ou iguale a população do país B, mantidas as taxas de crescimento. */

        int paisA = 80000;
        int paisB = 200000;


        int anos = 0;

        while (paisA <= paisB){
            paisA += (paisA / 100) * 3;
            paisB += (paisB / 100) * 1.5;
            anos++;
        }

        System.out.println("Quantidade de anos necessarios: "+ anos+ " anos.");
        System.out.println("Populacao pais A: "+ paisA);
        System.out.println("Populacao pais B: "+ paisB);


    }
}

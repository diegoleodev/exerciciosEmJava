package cursojavaloiane.ExerciciosAulas19;


import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        /* Implementar um programa que obtenha a cotação do dólar (U$) em
            relação ao real (R$) e a seguir armazene em vetor A com 20
            elementos as seguintes conversões: */
        Scanner scan = new Scanner(System.in);

        double cotacaoDolar;
        double[] vetorA = new double[20];

        System.out.print("Digite a cotação do dólar em relação ao real: ");
        cotacaoDolar = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacaoDolar * (i+1);
        }
        System.out.println("Conversões: ");
        for (int i = 0; i <  vetorA.length; i++) {
            System.out.println((i + 1) + " dólar = " + String.format("%.2f", vetorA[i]) + " reais");
        }
    }
}

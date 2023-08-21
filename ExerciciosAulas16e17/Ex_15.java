package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        /* A série de Fibonacci é formada pela seqüência
            1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
            até o n−ésimo termo. */
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scan.nextInt();


        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        for (int i = 1; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    // Método para calcular o termo da série de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int termoAnterior1 = 1;
            int termoAnterior2 = 1;
            int resultado = 0;

            for (int i = 3; i <= n; i++) {
                resultado = termoAnterior1 + termoAnterior2;
                termoAnterior1 = termoAnterior2;
                termoAnterior2 = resultado;
            }

            return resultado;
        }
    }
}

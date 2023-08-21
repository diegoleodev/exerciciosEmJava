package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        /* Altere o programa anterior para mostrar no final a soma dos números */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com outro inteiro: ");
        int segundoNumero = scan.nextInt();

        int menor = Math.min(primeiroNumero, segundoNumero);
        int maior = Math.max(primeiroNumero, segundoNumero);

        System.out.println("----------------------------------------------------------");
        System.out.println("números inteiros que estão no intervalo de "+ menor+ " e "+ maior+": ");



        int i= 0;
        for (i = menor + 1; i < maior; i++ ){
            System.out.print(i+" ");
        }

        System.out.println("");

        int soma = 0;
        String somaString = "";

        for (i = menor + 1; i < maior; i++) {
            soma += i;
            somaString += i + (i < maior - 1 ? " + " : " = ");
        }

        System.out.println("A soma de " + somaString + soma);
        System.out.println("O soma dos numeros é: " + soma);
    }
}

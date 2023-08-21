package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        /* Faça um Programa que leia três números e mostre-os em ordem
            decrescente. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre  com o um número: ");
        int primeiroNumero = scan.nextInt();
        System.out.println("Entre  com outro número: ");
        int segundoNumero = scan.nextInt();
        System.out.println("Entre  com outro número: ");
        int terceiroNumero = scan.nextInt();

        int maior, medio, menor;

        // Encontra o maior número
        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            maior = primeiroNumero;
            medio = Math.max(segundoNumero, terceiroNumero);
            menor = Math.min(segundoNumero, terceiroNumero);
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            maior = segundoNumero;
            medio = Math.max(primeiroNumero, terceiroNumero);
            menor = Math.min(primeiroNumero, terceiroNumero);
        } else {
            maior = terceiroNumero;
            medio = Math.max(primeiroNumero, segundoNumero);
            menor = Math.min(primeiroNumero, segundoNumero);
        }

        System.out.println(maior);
        System.out.println(medio);
        System.out.println(menor);
    }
}

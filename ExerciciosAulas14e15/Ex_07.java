package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que leia três números e mostre o maior e o menor deles. */

        System.out.print("Entre com um número: ");
        int num1 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int num2 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int num3 = scan.nextInt();

        int maior = num1;
        int menor = num1;

        if (num2 > maior){
            maior = num2;
        }
        if (num3 > maior){
            maior = num3;
        }
        if (num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }

        System.out.println(maior+ " é o maior");
        System.out.println(menor+ " é o menor");
    }
}

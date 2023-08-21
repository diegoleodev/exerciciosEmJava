package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que leia três números e mostre o maior deles */

        System.out.print("Entre com um número: ");
        int num1 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int num2 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " é maior!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " é maior!");
        }else {
            System.out.println(num3 + " é maior!");
        }
    }
}

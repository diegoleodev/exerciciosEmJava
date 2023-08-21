package cursojavaloiane.ExerciciosAula13;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Faça um Programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
            a. o produto do dobro do primeiro com metade do segundo .
            b. a soma do triplo do primeiro com o terceiro.
            c. o terceiro elevado ao cubo. */

        int primeiroNumero, segundoNumero;
        double terceiroNumero;

        System.out.print("Digite um numero inteiro: ");
        primeiroNumero = scan.nextInt();
        System.out.print("Digite mais um numero inteiro: ");
        segundoNumero = scan.nextInt();
        System.out.print("Digite um numero real: ");
        terceiroNumero = scan.nextDouble();


        int produtoDobro = ((2 * primeiroNumero) * (segundoNumero /2));
        double soma = (primeiroNumero * 3) + terceiroNumero;
        double cubo = Math.pow(terceiroNumero, 3);


        System.out.println("Produto do dobro do primeiro com metade do segundo: "+ produtoDobro);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+ soma);
        System.out.println("O terceiro elevado ao cubo: "+ cubo);

    }
}

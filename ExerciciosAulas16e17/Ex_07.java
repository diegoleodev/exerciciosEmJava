package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        /* 7. Faça um programa que leia 5 números e informe o maior número. */
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maiorNum = 0;
        int posicao = 0;

        String todosiguais ="";
        for (int i = 1; i <= 5; i++){
            System.out.print("Digite "+ i +"º número: ");
             numero = scan.nextInt();
             if (numero > maiorNum){
                 maiorNum = numero;
                 posicao = i;
             }

        }
        System.out.println("----------------------------------");

        System.out.println("O número de "+ posicao+ "º é o maior número que é igual a = "+ maiorNum);

    }
}

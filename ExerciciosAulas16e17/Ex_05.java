package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        /* Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
            Valide a entrada e permita repetir a operação. */
        Scanner scan = new Scanner(System.in);

        double paisA, paisB;
        double taxaPaisA, taxaPaisB;

       do{
           System.out.print("População Pais A: ");
           paisA = scan.nextInt();
           if (paisA < 0 ){
               System.out.println("Erro: O numero da população do Pais A nao pode ser menor que 0. Tente Novamente. ");
           }
       }while (paisA < 0);

        do{
            System.out.print("Taxa Pais A: ");
            taxaPaisA = scan.nextDouble();
            if (taxaPaisA <= 0 ){
                System.out.println("Erro: A taxa da população do Pais A nao pode ser menor ou igual a 0. Tente Novamente. ");
            }
        }while (taxaPaisA <= 0);

        do{
            System.out.print("População Pais A: ");
            paisB = scan.nextInt();
            if (paisB < 0 ){
                System.out.println("Erro: O numero da população do Pais B nao pode ser menor que 0. Tente Novamente. ");
            }
        }while (paisB < 0);

        do{
            System.out.print("Taxa Pais B: ");
            taxaPaisB = scan.nextDouble();
            if (taxaPaisB <= 0 ){
                System.out.println("Erro: A taxa da população do Pais B nao pode ser menor ou igual a 0. Tente Novamente. ");
            }
        }while (taxaPaisB <= 0);

        int contador = 0;
        while ( paisA < paisB){
            paisA += (paisA /100) * taxaPaisA;
            paisB += (paisB /100) * taxaPaisB;
            contador++;
        }
        System.out.println("--------------------------------------");
        System.out.println("Taxa Pais A: "+ taxaPaisA+" %");
        System.out.println("Taxa Pais A: "+ taxaPaisB+" %");
        System.out.println("--------------------------------------");
        System.out.println("Quantidade de anos necessarios: "+ contador + " anos.");
        System.out.println("Populacao pais A: "+ String.format("%.0f", paisA));
        System.out.println("Populacao pais B: "+ String.format("%.0f", paisB));

    }
}

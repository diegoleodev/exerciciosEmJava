package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        /* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
            qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
            numero ele deseja ver a tabuada. A saída deve ser conforme o
            exemplo abaixo: */

        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int tabuada = scan.nextInt();

        for (int num = 0; num <= 10; num++){
            int calc = tabuada * num;
            System.out.println(tabuada + " x "+ num + " = "+ calc);
        }
    }
}

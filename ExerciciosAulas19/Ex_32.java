package cursojavaloiane.ExerciciosAulas19;



public class Ex_32 {
    public static void main(String[] args) {
        /* Criar um vetor A com 5 elementos inteiros. Escreva um programa que
            imprima a tabuada de cada um dos elementos do vetor A. */


        int[] num = {5, 4};

        for (int i = 0; i <  num.length ; i++){
            System.out.println("Tabuada de "+ num[i]+":");
            for (int x = 0; x < 10; x++){
                int tabuada = num[i] * (x+1);
                System.out.println(" "+num[i] + " x "+ (x+1) + " = "+ tabuada);
            }
            System.out.println();
        }
    }
}

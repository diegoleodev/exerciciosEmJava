package cursojavaloiane.ExerciciosAulas19;

public class Ex_35 {
    public static void main(String[] args) {
        /* Criar um vetor A com 10 elementos inteiros. Escreva um programa que
        imprima cada elemento do vetor A e a relação de todos os divisores do
        respectivo elemento.. */

        int[] vetorA = {4, 5, 6, 7, 8, 32, 66, 77, 44, 33, 998};

        for (int i = 0; i < vetorA.length; i++){

            System.out.print(vetorA[i]+ " é divisivel por: ");
            for (int x = 1; x <= vetorA[i]; x++){

                if (vetorA[i] % x == 0){
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}

package cursojavaloiane.ExerciciosAulas19;

public class Ex_33 {
    public static void main(String[] args) {
        /* Criar um vetor A com 10 elementos inteiros. Escreva um programa que
            imprima cada elemento do vetor A e uma mensagem indicando se o
            respectivo elemento é um número primo ou não. */

        int[] vetorA = { 2, 7, 4, 13, 11, 6, 17, 9, 23, 111 };

        for (int i = 0; i < vetorA.length; i++) {
            int elemento = vetorA[i];

            if (ehPrimo(elemento)) {
                System.out.println(elemento + " é um número primo.");
            } else {
                System.out.println(elemento + " não é um número primo.");
            }
        }

    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

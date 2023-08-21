package cursojavaloiane.ExerciciosAulas19;



public class Ex_23 {
    public static void main(String[] args) {
        /* .Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
            que verifique se "todos" os elementos do vetor A são pares. Se pelo
            menos um elemento do vetor não for par o processo de repetição para
            percorrer os elementos do vetor deve ser encerrado, como sugestão:
            utilize uma variável do tipo flag para atingir este propósito. */


        int[] A = {2, 4, 6, 8, 10, 12, 14, 17, 18, 20}; 

        boolean todosPares = true;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 != 0) {
                todosPares = false;
                break;
            }
            System.out.println(A[i]);
        }

        if (todosPares) {
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Pelo menos um elemento do vetor não é par.");
        }
    }
}

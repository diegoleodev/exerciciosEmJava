package cursojavaloiane.ExerciciosAulas19;

public class Ex_24 {
    public static void main(String[] args) {
        /* Números palíndromos são aqueles que escritos da direita para a
            esquerda têm o mesmo valor quando escritos da esquerda para a
            direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
            programa que verifique se um dado vetor A de 10 elementos inteiros é
            um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
            último, se o segundo elemento do vetor é igual ao penúltimo e assim
            por diante até verificar todos os elementos ou chegar a conclusão que
            o vetor não é um palíndromo. */

        int[] vetorA = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        // Variável para controlar a verificação do palíndromo
        boolean ehPalindromo = true;

        // Percorrer o vetor até chegar ao meio
        for (int i = 0; i < vetorA.length / 2; i++) {
            // Comparar elementos simétricos no vetor
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                ehPalindromo = false;
                break; // Se encontrar elementos diferentes, não é mais necessário verificar
            }
        }
        // Imprimir o resultado
        if (ehPalindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor NÃO é um palíndromo.");
        }
    }
}

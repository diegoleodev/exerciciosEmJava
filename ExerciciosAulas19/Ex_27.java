package cursojavaloiane.ExerciciosAulas19;



public class Ex_27 {
    public static void main(String[] args) {
        /* .Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
            a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
            receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
            maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
            igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
            Sugestão: char B[10]; */

        int[] vetorA = {4, 6, 7, 8 , 9, 10, 10, 81, 90, 12};

        char[] vetorB = new char[vetorA.length];


        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            }
            if (vetorA[i] == 7){
                vetorB[i] = 'b';
            }
            if (vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            }
            if (vetorA[i] == 10){
                vetorB[i] = 'd';
            }
            if (vetorA[i] > 10){
                vetorB[i] = 'e';
            }
        }
        System.out.print("vetor A: ");
        for (int numA : vetorA){
            System.out.print(numA+ " ");
        }
        System.out.println();

        System.out.print("vetor B: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i]+ " ");
        }
    }
}

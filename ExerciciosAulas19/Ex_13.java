package cursojavaloiane.ExerciciosAulas19;

public class Ex_13 {
    public static void main(String[] args) {
        /*  Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que determine a soma dos elementos armazenados neste vetor que
            são múltiplos de 5. */


        int[] vetorA = new int[10];

        vetorA [0] = 22;
        vetorA [1] = 10;
        vetorA [2] = 20;
        vetorA [3] = 20;
        vetorA [4] = 30;
        vetorA [5] = 30;
        vetorA [6] = 40;
        vetorA [7] = 44;
        vetorA [8] = 50;
        vetorA [9] = 53;
        System.out.println();

        int soma = 0, total=0;
        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] % 5 == 0){
                soma = vetorA[i];
                total += soma;
                System.out.println((i+1)+"º elemento: "+ vetorA[i]+ " é múltiplo de 5");
            }else{
                System.out.println((i+1)+"º elemento:  "+ vetorA[i]+ " não é múltiplo de 5");
            }
        }

        System.out.println("A soma de todos os elementos multiplos de 5 : "+ total);



    }
}
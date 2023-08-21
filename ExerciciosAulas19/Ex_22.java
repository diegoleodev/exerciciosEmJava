package cursojavaloiane.ExerciciosAulas19;


public class Ex_22 {
    public static void main(String[] args) {
        /* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
            0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
            para implementar um programa que determine o percentual de
            números 0's e 1's existentes no vetor A */


        int[] vetorA = new int[10];

        for (int i=0; i< vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random()* 1);
            System.out.println("valor: "+ vetorA[i]);
        }
        double contador0=0, contador1=0;
        double percentualDe0=0, percentualDe1=0;
        for (int i=0; i< vetorA.length; i++) {
            if (vetorA[i] == 0) {
                contador0++;
                percentualDe0 = (contador0 / vetorA.length ) * 100;
            }
            if (vetorA[i] == 1) {
                contador1++;
                percentualDe1 = (contador1 / vetorA.length ) * 100;
            }
        }
        String porcentagem0Format = String.format("%.2f", percentualDe0);
        String porcentagem1Format = String.format("%.2f", percentualDe1);

        System.out.println("percentual de 0's existentes: "+ porcentagem0Format+ "%");
        System.out.println("percentual de 1's existentes: "+ porcentagem1Format+ "%");
    }
}

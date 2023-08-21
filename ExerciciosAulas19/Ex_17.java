package cursojavaloiane.ExerciciosAulas19;

public class Ex_17 {
    public static void main(String[] args) {
        /* .Ler um vetor A com 10 elementos inteiros correspondentes as idades
            de um grupo de pessoas. Escreva um programa que determine e
            escreva a quantidade de pessoas que possuem idade superior a 35
            anos. */


        int[] idades = new int[10];

        idades [0] = 17;
        idades [1] = 18;
        idades [2] = 44;
        idades [3] = 38;
        idades [4] = 20;
        idades [5] = 19;
        idades [6] = 66;
        idades [7] = 15;
        idades [8] = 38;
        idades [9] = 22;

        String[] nomes = new String[idades.length];

        nomes [0] = "Albeto";
        nomes [1] = "Carla";
        nomes [2] = "Carlos";
        nomes [3] = "Ana";
        nomes [4] = "Sergio";
        nomes [5] = "Lucia";
        nomes [6] = "Rafael";
        nomes [7] = "Breno";
        nomes [8] = "Paulo";
        nomes [9] = "Diego";

        int cont = 0;
        for (int i = 0; i < idades.length; i++){
            System.out.println(nomes[i]+" tem "+ idades[i]+ " anos.");
            if (idades[i] > 35){
                cont++;
            }
        }

        System.out.println("-------------------------------------------------");


        System.out.println("Quantidade de pessoas que possuem a idade superior a 35 anos: "+ cont+ " pessoas");


        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35){
                System.out.println(nomes[i]+" tem "+ idades[i]+ " anos.");
            }
        }


    }
}
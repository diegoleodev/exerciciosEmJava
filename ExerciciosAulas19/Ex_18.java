package cursojavaloiane.ExerciciosAulas19;

public class Ex_18 {
    public static void main(String[] args) {
        /* Ler um vetor A com 10 elementos inteiros correspondentes as idades
            de um grupo de pessoas. Escreva um programa que determine e
            escreva a menor e a maior idades e suas respectivas posições */


        int[] idades = new int[10];

        idades [0] = 17;
        idades [1] = 18;
        idades [2] = 44;
        idades [3] = 7;
        idades [4] = 20;
        idades [5] = 19;
        idades [6] = 8;
        idades [7] = 90;
        idades [8] = 38;
        idades [9] = 78;

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

        int idade =0;
        int menorIdade= 0;

        menorIdade = idades[0];
        int maiorIdade = 0;
        for (int i = 0; i < idades.length; i++) {
            idade = idades[i];
            if (menorIdade < idade){
                menorIdade = menorIdade;
            }else{
                menorIdade = idade;
            }

            if (idade > maiorIdade){
                maiorIdade = idade;
            }


        }
        System.out.println("menor idade: "+menorIdade);
        System.out.println("maior idade: "+maiorIdade);




    }
}
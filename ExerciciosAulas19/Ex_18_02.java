package cursojavaloiane.ExerciciosAulas19;

import java.util.Scanner;

public class Ex_18_02 {
    public static void main(String[] args) {
        /* Ler um vetor A com 10 elementos inteiros correspondentes as idades
            de um grupo de pessoas. Escreva um programa que determine e
            escreva a menor e a maior idades e suas respectivas posições */

        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] idades = new int[tamanhoVetor];

        System.out.println("Digite as "+ tamanhoVetor+ " idades: ");

        for (int i = 0; i < tamanhoVetor; i++){
            System.out.println("Idade "+ (i+1)+ ": ");
            idades[i] = scan.nextInt();
        }

        int idadeInformadas = 0;
        System.out.println("Idades informadas; ");
        do{
            if (idadeInformadas == 0){
                System.out.print(""+idades[idadeInformadas]);
            }else{
                System.out.print(", "+idades[idadeInformadas]);
            }
            idadeInformadas++;
        }while (idadeInformadas < tamanhoVetor);
        System.out.println();



        int menorIdade = idades[0];
        int maiorIdade=0;
        for (int i = 0; i< idades.length; i++){
            int verficarIdade = idades[i];
            if (menorIdade < verficarIdade){
                menorIdade = menorIdade;
            }else{
                menorIdade = verficarIdade;
            }

            if (verficarIdade > maiorIdade){
                maiorIdade = verficarIdade;
            }

        }

        System.out.println("Menor idade: "+ menorIdade);
        System.out.println("Maior idade: "+ maiorIdade);



    }
}
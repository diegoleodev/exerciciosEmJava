package cursojavaloiane.ExerciciosAulas19;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        /* Ler as duas notas bimestrais para um conjunto de 10 alunos.
            Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
            tipo real. Escreva um programa que calcule a média aritmética simples
            das notas informadas armazenando o resultado em um vetor “Result”
            de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
            de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
            estará “aprovado”, caso contrário, a situação do aluno será
            “reprovado”.*/

        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 10;
        double[] nota1 = new double[tamanhoVetor];
        double[] nota2 = new double[tamanhoVetor];
        double[] result = new double[tamanhoVetor];

        String primeiro="";
        String segundo="";
        System.out.println();
        System.out.println("Informe as notas dos "+ tamanhoVetor+" alunos : ");
        for (int i = 0; i < tamanhoVetor; i++){

            System.out.print("Primeira nota do aluno: "+ (i+1)+": ");
            nota1[i] = scan.nextDouble();
            System.out.print("Segunda nota do aluno: "+ (i+1)+": ");
            nota2[i] = scan.nextDouble();
        }
        System.out.println();
        System.out.println("Notas informadas: ");
        for (int i = 0; i < tamanhoVetor; i++){
            System.out.println("Primeira nota do "+ (i+1)+ " aluno: "+ nota1[i]);
            System.out.println("Segunda nota do "+ (i+1)+ " aluno: "+ nota2[i]);
            System.out.println("---------------------------------------------------");
        }
        System.out.println();
        System.out.println("Médias:");

        for (int i = 0; i < tamanhoVetor; i++){
            double soma = 0, media=0;

            soma = nota1[i] + nota2[i];
            media = soma / 2;
            result[i] = media;
            System.out.println("Média do aluno "+ (i+1)+ ": "+ media);
            if (result[i] >= 7){
                System.out.println("Situação: Aprovado");
            }else{
                System.out.println("Situação: Reprovado");
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
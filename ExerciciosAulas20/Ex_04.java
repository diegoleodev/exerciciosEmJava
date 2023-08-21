package cursojavaloiane.ExerciciosAulas20;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        /* Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve
        conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado)
        . O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em
        seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora
        para obter o compromisso armazenado */

        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[31][24];

        int opcao ;
        do{
            System.out.println("\n==== Menu ====");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("3 - Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scan.nextInt();
            if (opcao == 1){

                System.out.print("Dia desejado (1-31): ");
                int dia = scan.nextInt();

                System.out.print("Hora desejada (1-24): ");
                int hora = scan.nextInt();

                scan.nextLine();

                System.out.print("Digite o compromisso: ");
                String compromisso = scan.nextLine();


                if (dia >= 0 & dia <= 31 && hora > 0 && hora <= 24){
                    agenda[dia][hora] = compromisso;
                    System.out.println("Compromisso realizado com sucesso.");
                }else{
                    System.out.println("Dia ou hora Inválida!O compromisso não foi adicionado.");
                }

            } else if (opcao == 2) {

                System.out.print("Dia do compromisso que deseja consultar (1-31): ");
                int dia = scan.nextInt();

                System.out.print("Hora que deseja consultar (1-24): ");
                int hora = scan.nextInt();

                if (dia >= 0 & dia <= 31 && hora > 0 && hora <= 24){
                    String compromisso = agenda[dia][hora];
                    if (compromisso != null) {
                        System.out.println("Compromisso encontrado:");
                        System.out.println(compromisso);
                    } else {
                        System.out.println("Nenhum compromisso encontrado para esta hora.");
                    }
                }else{
                    System.out.println("Dia ou hora Inválida!");
                }


            } else if (opcao == 3) {
                System.out.println("Encerrando o programa.");
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 3);

    }
}

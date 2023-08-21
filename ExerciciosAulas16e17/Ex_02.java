package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* Faça um programa que leia um nome de usuário e a sua senha e não
            aceite a senha igual ao nome do usuário, mostrando uma mensagem
            de erro e voltando a pedir as informações. */

        String nomeUsuario;
        String senha;

        do {
            System.out.println("Digite o nome de usuário:");
            nomeUsuario = scan.nextLine();

            System.out.println("Digite a senha:");
            senha = scan.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Nome de usuário e senha aceitos!");


    }
}

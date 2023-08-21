package cursojavaloiane.ExerciciosAulas20;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "diegoleonardo912@gmail.com";
        String senha = "cocobambusetesete";

        boolean verificacao;

        int i = 0;
        int tentativas = 5;

        do {
            System.out.println("Login: ");
            String loginInput = scan.next();
            System.out.println("Senha: ");
            String senhaInput = scan.next();

            if (!loginInput.equals(login) || !senhaInput.equals(senha)){
                verificacao = false;
                if (tentativas == 1){
                    System.out.println("Atenção você so terá mais 1 tentativa, caso erre novamente seu acesso sera bloqueado.");
                }else if( tentativas == 0){
                    System.out.println("Acesso Bloqueado!");
                }else{
                    System.out.println("Login ou senha inválido.Tente novamente.");
                    System.out.println("Voce tem mais "+ tentativas+ " tentativas");
                }

            }else{
                verificacao = true;
                System.out.println("login efetuado com sucesso.");
            }
            i++;
            tentativas--;
        }while (verificacao == false && i <= 5);
    }
}

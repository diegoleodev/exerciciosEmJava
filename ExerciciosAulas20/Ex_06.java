package cursojavaloiane.ExerciciosAulas20;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {
    /* Faça um programa para jogar o jogo da velha. O programa deve
    permitir que dois jogadores façam uma partida do jogo da velha,
    usando o computador para ver o tabuleiro. Cada jogador vai
    alternadamente informando a posição onde deseja colocar a sua
    peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
    determinar automaticamente quando o jogo terminou e quem foi o
    vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
    deve atualizar a situação do tabuleiro na tela */

        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        System.out.println("########### JOGO DA VELHA ############");

        System.out.println("JOGADOR 1 = X");
        System.out.println("JOGADOR 2 = O");

        boolean ganhou = false;
        int jodada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou){
            if (jodada % 2 == 1){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while (!linhaValida){
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else{
                    System.out.println("Linha inválida, tente novamente");
                }
            }
            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else{
                    System.out.println("Coluna inválida, tente novamente");
                }
            }
            linha--;
            coluna--;
            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O' ){
                System.out.println("Posicão ja usada.Tente novamente");
            }else{
                tabuleiro[linha][coluna] = sinal;
                jodada++;

            }
        }
    }
}

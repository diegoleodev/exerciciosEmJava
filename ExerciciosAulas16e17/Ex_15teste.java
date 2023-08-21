package cursojavaloiane.ExerciciosAulas16e17;


import java.util.Scanner;

public class Ex_15teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 10;

        if (n == 1 || n == 2){
            n = 1;
        }else{
            int termoAnterior1 = 1;
            int termoAnterior2 = 1;
            int resultado = 0;

            for (int i = 1; i <= n; i++) {
                resultado = termoAnterior1 + termoAnterior2;
                termoAnterior1 = termoAnterior2;
                termoAnterior2 = resultado;

                System.out.print(resultado+ ", ");
            }
        }
    }
}

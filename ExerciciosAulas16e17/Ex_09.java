package cursojavaloiane.ExerciciosAulas16e17;

public class Ex_09 {
    public static void main(String[] args) {
        /* Faça um programa que imprima na tela apenas os números ímpares
        entre 1 e 50. */

        int i = 0;
        for (; i <= 50; i++){
            if (i % 2 == 0 == false){
                System.out.println("Número "+ i+ ": impar");
            }
        }
    }
}

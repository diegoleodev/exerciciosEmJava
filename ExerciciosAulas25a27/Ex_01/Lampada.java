package cursojavaloiane.ExerciciosAulas25a27.Ex_01;

public class Lampada {

    String marca;
    String cor;
    double preco;
    double potencia;

    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("A lampada esta lidada");
        }else{
            System.out.println("A lampada esta desligada");
        }
    }


}

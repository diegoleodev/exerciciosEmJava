package cursojavaloiane.ExerciciosAulas24.Ex_05;

public class Ex_05 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "12345";
        conta.agencia = "1233";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = 10;

        System.out.println("Saldo da conta "+ conta.numero + " = "+ conta.saldo);


    }
}

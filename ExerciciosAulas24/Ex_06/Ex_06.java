package cursojavaloiane.ExerciciosAulas24.Ex_06;

public class Ex_06 {
    public static void main(String[] args) {

        Contato contato1 = new Contato();

        contato1.nome = "Joao";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[3];

        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";

        for (int i = 0; i < contato1.telefones.length; i++){
            System.out.print("telefone "+(i+1)+": ");
            System.out.println(contato1.telefones[i]);
        }
    }
}

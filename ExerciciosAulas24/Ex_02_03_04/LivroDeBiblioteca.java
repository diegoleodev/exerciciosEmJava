package cursojavaloiane.ExerciciosAulas24.Ex_02_03_04;

public class LivroDeBiblioteca {
    public static void main(String[] args) {
        Livro livroDeBiblioteca = new Livro();

        System.out.println("livro De Biblioteca");

        livroDeBiblioteca.titulo = "O Mistério da Biblioteca Perdida";
        livroDeBiblioteca.autor = "Jane Doe";
        livroDeBiblioteca.editora = "Conhecimento Antigo S.A";
        livroDeBiblioteca.idioma = "Português";
        livroDeBiblioteca.anoPublicacao = 2021;
        livroDeBiblioteca.numRegistro =  13243634;

        System.out.println("Titulo: "+ livroDeBiblioteca.titulo);
        System.out.println(livroDeBiblioteca.autor);
        System.out.println(livroDeBiblioteca.editora);
        System.out.println(livroDeBiblioteca.idioma);
        System.out.println(livroDeBiblioteca.anoPublicacao);
        System.out.println(livroDeBiblioteca.numRegistro);

    }
}

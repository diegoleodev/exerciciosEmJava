package cursojavaloiane.ExerciciosAulas24.Ex_02_03_04;

public class LivroDeLivraria {
    public static void main(String[] args) {

        System.out.println("livro De Livraria ");

        Livro livroDeLivraria = new Livro();

        livroDeLivraria.titulo = "Aventuras na Terra Encantada";
        livroDeLivraria.autor = "John Smith";
        livroDeLivraria.editora = "Imaginação & Fantasia Ltda";
        livroDeLivraria.idioma = "Português";
        livroDeLivraria.edicao = "2023";
        livroDeLivraria.formato = "Capa dura";
        livroDeLivraria.anoPublicacao = 2023;
        livroDeLivraria.numPaginas = 320;
        livroDeLivraria.precoLivro = 39.99;

        System.out.println(livroDeLivraria.titulo);
        System.out.println(livroDeLivraria.autor);

    }
}

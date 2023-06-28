package Principio1;

public class ExibidorInformacoesLivro {
    public static void exibirInformacoes(Livro livro) {
        System.out.println("Nome: " + livro.getNomeDoLivro());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Autor: " + livro.getAutor());
    }
}





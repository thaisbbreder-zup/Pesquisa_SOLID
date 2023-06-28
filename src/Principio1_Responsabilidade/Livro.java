package Principio1_Responsabilidade;

public class Livro {
    private String isbn;
    private String nomeDoLivro;
    private String genero;
    private String autor;

    public Livro(String isbn, String nomeDoLivro, String genero, String autor) {
        this.isbn = isbn;
        this.nomeDoLivro = nomeDoLivro;
        this.genero = genero;
        this.autor = autor;
    }

    // getters para as propriedades do livro
    public String getIsbn() {
        return isbn;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nomeDoLivro);
        System.out.println("ISBN: " + isbn);
        System.out.println("Gênero: " + genero);
        System.out.println("Autor: " + autor);
    }
}
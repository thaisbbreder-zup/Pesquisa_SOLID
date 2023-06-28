package Principio1;

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

}

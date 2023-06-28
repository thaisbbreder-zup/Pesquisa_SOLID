package Principio1_Responsabilidade;

public class RegistroLivro {
    public void registrarLivro(String isbn) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + ".");
    }

    public void registrarLivro(String isbn, String nomeDoLivro) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + ".");
    }

    public void registrarLivro(String isbn, String nomeDoLivro, String genero) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + ".");
    }

    public void registrarLivro(String isbn, String nomeDoLivro, String genero, String autor) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " do autor " + autor + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + ".");
    }
}

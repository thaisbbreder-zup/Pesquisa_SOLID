package Principio1_Responsabilidade;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("9789896661458", "Rita Lee: uma autobiografia", "Autobiografia", "Rita Lee");
        Livro livro2 = new Livro("9780857533937", "O Menino do Pijama Listrado", "Ficção", "");
        Livro livro3 = new Livro("9788869183157", "Harry Potter e a Pedra Filosofal", "", "");
        Livro livro4 = new Livro("9788869183157", "", "", "");

        RegistroLivro registroLivro = new RegistroLivro();

        System.out.println("***************************** REGISTRO DE LIVROS NA BIBLIOTECA *****************************\n");

        System.out.println("| Livro 1 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        ExibidorInformacoesLivro.exibirInformacoes(livro1);
        registroLivro.registrarLivro(livro1.getIsbn(), livro1.getNomeDoLivro(), livro1.getGenero(), livro1.getAutor());
        System.out.println();

        System.out.println("| Livro 2 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        ExibidorInformacoesLivro.exibirInformacoes(livro2);
        registroLivro.registrarLivro(livro2.getIsbn(), livro2.getNomeDoLivro(), livro2.getGenero(), livro2.getAutor());
        System.out.println();

        System.out.println("| Livro 3 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        ExibidorInformacoesLivro.exibirInformacoes(livro3);
        registroLivro.registrarLivro(livro3.getIsbn(), livro3.getNomeDoLivro(), livro3.getGenero(), livro3.getAutor());
        System.out.println();

        System.out.println("| Livro 4 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        ExibidorInformacoesLivro.exibirInformacoes(livro4);
        registroLivro.registrarLivro(livro4.getIsbn(), livro4.getNomeDoLivro(), livro4.getGenero(), livro4.getAutor());
    }
}
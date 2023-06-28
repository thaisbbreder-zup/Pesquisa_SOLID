package Principio4_Segregacao;

public class Impressora implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }
}
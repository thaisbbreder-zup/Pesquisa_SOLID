package Principio5_Inversao;

public class Carro {
    private Engine motor;

    public Carro(Engine motor) {
        this.motor = motor;
    }

    public void ligarCarro() {
        motor.ligar();
    }

    public void desligarCarro() {
        motor.desligar();
    }
}

package Principio5_Inversao;

public class MotorGasolina implements Engine {
    @Override
    public void ligar() {
        System.out.println("Motor a gasolina ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Motor a gasolina desligado.");
    }
}
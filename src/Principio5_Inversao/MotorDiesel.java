package Principio5_Inversao;

public class MotorDiesel implements Engine {
    @Override
    public void ligar() {
        System.out.println("Motor a diesel ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Motor a diesel desligado.");
    }
}
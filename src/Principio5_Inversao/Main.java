package Principio5_Inversao;

public class Main {
    public static void main(String[] args) {
        Engine motorGasolina = new MotorGasolina();
        Carro carroGasolina = new Carro(motorGasolina);
        carroGasolina.ligarCarro();
        carroGasolina.desligarCarro();

        Engine motorDiesel = new MotorDiesel();
        Carro carroDiesel = new Carro(motorDiesel);
        carroDiesel.ligarCarro();
        carroDiesel.desligarCarro();
    }
}

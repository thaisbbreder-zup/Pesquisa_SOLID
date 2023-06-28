package Principio3_Liskov;

public class MotorCar implements Car {
    private Engine engine;

    public void accelerate() {
        engine.turnOn();
    }
}
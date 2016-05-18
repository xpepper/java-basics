package it.xpeppers.learn.subclass.visibility;

public class Car {

    private int cylinders;
    protected int speed;

    public Car(int cylinders, int initialSpeed) {
        this.cylinders = cylinders;
        this.speed = initialSpeed;
    }

    public void accelerate(int speedGain) {
        speed = getSpeed() + speedGain;
    }

    public Double carTaxes() {
        return cylinders * 0.75;
    }

    public int getSpeed() {
        return speed;
    }
}

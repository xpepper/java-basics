package it.xpeppers.learn.subclass.visibility;

public class Taxi extends Car {

    public Taxi(int cylinders) {
        super(cylinders, 0);
    }

    @Override
    public void accelerate(int speedGain) {
        if (speedGain > 10) {
            speed += 10;
        } else {
            super.accelerate(speedGain);
        }
    }
}

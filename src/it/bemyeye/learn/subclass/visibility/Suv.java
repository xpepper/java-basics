package it.bemyeye.learn.subclass.visibility;

public class Suv extends Car {

    boolean isInLabTesting = true;

    public Suv(int cylinders, int initialSpeed) {
        super(cylinders, initialSpeed);
    }

    @Override
    public Double carTaxes() {
        return super.carTaxes() * 2;
    };

    @Override
    public int getSpeed() {
        if (isInLabTesting) {
            return super.getSpeed() + 5;
        }
        return super.getSpeed();
    }
}

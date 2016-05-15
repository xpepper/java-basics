package it.bemyeye.learn.subclass.override.example;

class Suv extends Car {

    public Suv(int cylinders) {
        super(cylinders);
    }

    @Override
    public Double calcolaBollo() {
        return super.calcolaBollo() * 2;
    }
}
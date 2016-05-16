package it.bemyeye.learn.exception;

public class Suv extends Car {

    public Suv(int cilindrata) {
        super(cilindrata);
    }

    @Override
    public Double carTaxes() {
        return super.carTaxes() * 2;
    }

}

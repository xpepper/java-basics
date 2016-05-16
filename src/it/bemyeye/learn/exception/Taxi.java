package it.bemyeye.learn.exception;

public class Taxi extends Car {

    private String license;

    public Taxi(int engineDisplacement, String license) {
        super(engineDisplacement);
        this.license = license;
    }

    @Override
    public Double carTaxes() {
        return super.carTaxes() / 2;
    }

    public String getLicense() {
        return license;
    }
}

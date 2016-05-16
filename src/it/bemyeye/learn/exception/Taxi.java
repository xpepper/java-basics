package it.bemyeye.learn.exception;

public class Taxi extends Car {

    private String license;

    public Taxi(int engineDisplacement, String license) throws LicenseException {
        super(engineDisplacement);

        if (license == null || license.trim().length() == 0) {
            throw new LicenseException("invalid license", 0);
        }

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

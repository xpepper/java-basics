package it.bemyeye.learn.interface_;

public abstract class Car {
    private static final int DEFAULT_ENGINE_CYLINDERS = 1000;

    private int cylinders;
    private int currentSpeed;

    private TaxService taxService;

    public Car() {
        this(DEFAULT_ENGINE_CYLINDERS);
    }

    public Car(int engineDisplacement) {
        this.cylinders = engineDisplacement;
        taxService = new AciTaxiService();
    }

    public abstract String librettoDiCircolazione();

    public double carTaxes() {
        return taxService.computeTaxFor(cylinders);
    }

    public int getCylinders() {
        return cylinders;
    }
}

package it.bemyeye.learn.abstract_class;

public abstract class Car {
    private static final int DEFAULT_ENGINE_CYLINDERS = 1000;
    private static double BASIC_BOLLO_TAX_RATE = 0.75;

    int cylinders;
    int currentSpeed;

    public Car() {
        this(DEFAULT_ENGINE_CYLINDERS);
    }

    public Car(int engineDisplacement) {
        this.cylinders = engineDisplacement;
    }

    double calcolaBollo() {
        return cylinders * BASIC_BOLLO_TAX_RATE;
    }

    public abstract String librettoDiCircolazione();
}


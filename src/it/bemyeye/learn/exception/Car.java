package it.bemyeye.learn.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car extends Vehicle implements Taxable {
    private static final int _1000 = 1000;
    int cilindrata;
    int currentSpeed;
    private Date dataImmatricolazione;

    public static Taxable createWithStartingSpeed(int startingSpeed) {
        Car car = new Car(_1000);
        car.currentSpeed = startingSpeed;
        return car;
    }

    public Car(int cilindrata) {
        super("car code");
        this.cilindrata = cilindrata;
        this.currentSpeed = 0;
        this.dataImmatricolazione = new Date();
    }

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    public boolean collauda() {
        int c = currentSpeed;
        accelerate(100);
        return c+100 == currentSpeed;
    }

    public String dataImmatricolazione() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY HH:mm");
        return formatter.format(dataImmatricolazione);
    }

    @Override
    public Double carTaxes() {
        return cilindrata * 0.75;
    }

}

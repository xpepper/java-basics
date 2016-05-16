package it.bemyeye.learn.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import it.bemyeye.learn.exception.Suv;
import it.bemyeye.learn.exception.Taxable;
import it.bemyeye.learn.exception.Vehicle;

public class Car extends Vehicle implements Taxable {
    private static final int _1000 = 1000;

    private int cylinders;
    private int currentSpeed;
    private Date registrationDate;

    public static Taxable createWithStartingSpeed(int startingSpeed) {
        Car car = new Car(_1000);
        car.currentSpeed = startingSpeed;
        return car;
    }

    public static Taxable createSuv() {
        return new Suv(2_000);
    }

    public Car(int cylinders) {
        super("car code");
        this.cylinders = cylinders;
        this.currentSpeed = 0;
        this.registrationDate = new Date();
    }

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    public boolean vehicleTest() {
        int c = currentSpeed;
        accelerate(100);
        return c + 100 == currentSpeed;
    }

    public String registrationDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY HH:mm");
        return formatter.format(registrationDate);
    }

    @Override
    public Double carTaxes() {
        return cylinders * 0.75;
    }

}
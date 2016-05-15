package it.bemyeye.learn.subclass.override.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {

    @Test
    public void calcolaBolloDipendeDallaCilindrata() {
        Car car = new Car(1000);
        assertEquals(750.0, car.calcolaBollo(), 0);

        Suv suv = new Suv(1000);
        assertEquals(1500.0, suv.calcolaBollo(), 0);
    }
}

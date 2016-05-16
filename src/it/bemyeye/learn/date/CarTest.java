package it.bemyeye.learn.date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.bemyeye.learn.exception.Taxable;

public class CarTest {

    @Test
    public void computeCarTaxes() {
        Taxable car = new Car(1000);
        assertEquals(750.0, car.carTaxes(), 0.0);

        Taxable suv = Car.createSuv();
        assertEquals(3000.0, suv.carTaxes(), 0.0);
    }

    @Test
    public void carRegistrationDate() throws Exception {
        Car car = new Car(700);
        assertTrue(car.registrationDate().contains("-2016")); // wow terrible test: it depends on time!!
        assertTrue(car.registrationDate().matches("\\d{2}-\\d{2}-\\d{4}\\s\\d{2}:\\d{2}")); // better... any other improvement?
    }
}
package it.xpeppers.learn.subclass;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CarAndTaxiTest {

    @Test
    public void accelerateRaisesTheCarSpeed() {
        Car car = new Car();
        car.accelerate(20);
        assertThat(car.speed, is(20));

        Taxi taxi = new Taxi("AB123MK");
        taxi.accelerate(10);
        taxi.cylinderCapacity = 2000;

        assertThat(taxi.speed, is(10));
        assertThat(taxi.licence, is("AB123MK"));
        assertThat(taxi.cylinderCapacity, is(2000));

        System.out.println(car);
        System.out.println(taxi);
    }

    @Test
    public void classNames() {
        assertEquals("it.xpeppers.learn.subclass.Car", new Car().getClass().getName());
        assertEquals("it.xpeppers.learn.subclass.Taxi", new Taxi("asd").getClass().getName());
    }

}

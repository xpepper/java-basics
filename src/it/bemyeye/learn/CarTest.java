package it.bemyeye.learn;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

    @Test
    public void accelerateRaisesTheCarSpeed() {
        Car car = new Car();
        car.speed = 10;
        car.accelerate(30);

        assertEquals(40, car.speed);
    }

    @Test
    public void constructorBuildsAnInstanceOfCar() {
        assertTrue(new Car() instanceof Car);
    }

}

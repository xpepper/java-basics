import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

    @Test
    public void testAccelerateRaisesTheCarSpeed() {
        Car car = new Car();
        car.speed = 10;
        car.accelerate(30);

        assertEquals(42, car.speed);
    }

}

package it.xpeppers.learn.subclass.instance_of;

import java.math.BigDecimal;

class Car {
    int engineDisplacement;
    int currentSpeed;

    void accelerate(int speedGain) { currentSpeed += speedGain; }
}

class Taxi extends Car {
    String license;

    @Override
    void accelerate(int speedGain) {
        if (speedGain > 10) {
            currentSpeed += 10;
        } else {
            super.accelerate(speedGain);
        }
    }

    BigDecimal billing() {
        return new BigDecimal(14.55);
    }
}

class Test {
    public static void main(String[] args) {
        Car secondCar = new Taxi();

        Taxi aTaxi = (Taxi) secondCar; // fine at runtime,
        // because actually secondCar references a Taxi instance

        Car aCar = new Car();
        if (aCar instanceof Taxi) { // guard: true only if at runtime aCar references a Taxi instance
            aTaxi = (Taxi) aCar;
        }
    }
}

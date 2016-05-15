package it.bemyeye.learn.subclass.downcast;

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
        Car car = new Car(); // that's fine and easy

        Car secondCar = new Taxi(); // still fine, a taxi is a car too.
        // secondCar.billing(); // <= compile error! a Car reference cannot receive message that are defined in Taxi
        //                                       (e.g. that behavior is defined in Taxi, not in Car)

        Taxi taxiAtLast = ((Taxi) secondCar);
        taxiAtLast.billing(); // downcasting secondCar to Taxi explicitly, you can now call methods of Taxi
        // this is completely a programmer's decision and responsibility: if you made a mistake, at runtime you'll get a ClassCastException

        Taxi aFailingTaxi = (Taxi) new Car(); // dev's mistake: runtime exception!

        // Taxi taxi = new Car(); // <= another compile error: a car *is not* a taxi
    }
}
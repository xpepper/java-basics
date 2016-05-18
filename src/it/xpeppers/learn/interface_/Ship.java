package it.xpeppers.learn.interface_;

import java.util.Random;

public class Ship extends Vehicle {

    public Ship(String vehicleCode) {
        super(vehicleCode);
    }

    @Override
    public boolean vehicleTest() {
        return canFloat();
    }

    private boolean canFloat() {
        return new Random().nextBoolean();
    }
}

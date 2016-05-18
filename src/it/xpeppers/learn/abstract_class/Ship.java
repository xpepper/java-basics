package it.xpeppers.learn.abstract_class;

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

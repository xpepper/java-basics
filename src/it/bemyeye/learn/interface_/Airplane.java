package it.bemyeye.learn.interface_;

public class Airplane extends Vehicle {
    private int wings;

    public Airplane(String vehicleCode, int wings) {
        super(vehicleCode);
        this.wings = wings;
    }

    @Override
    public boolean vehicleTest() {
        return wings == 2;
    }
}

class VehicleSamples {
    public static void main(String[] args) {
        Testable[] vehicles = { new Airplane("A01", 2), new Ship("N02") };
        for (Testable vehicle : vehicles) {
            System.out.println("The vehicle test is " + vehicle.vehicleTest());
        }
    }
}


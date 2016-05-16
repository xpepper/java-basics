package it.bemyeye.learn.abstract_class;

public abstract class Vehicle {
    private String code;

    public Vehicle(String vehicleCode) {
        this.code = vehicleCode;
    }

    public String getCode() {
        return code;
    }

    public abstract boolean vehicleTest();

}

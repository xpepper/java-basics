package it.xpeppers.learn.interface_;

public abstract class Vehicle implements Testable {
    private String code;

    public Vehicle(String vehicleCode) {
        this.code = vehicleCode;
    }

    public String getCode() {
        return code;
    }

}

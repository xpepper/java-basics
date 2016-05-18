package it.xpeppers.learn.exception;

public abstract class Vehicle {
    private String code;

    public Vehicle(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

package it.xpeppers.learn.exception;

public class LicenseException extends Exception {

    private int code;

    public LicenseException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

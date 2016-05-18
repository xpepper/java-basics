package it.xpeppers.learn.subclass.override.example;

class Car {
    int cylinders;
    int currentSpeed;

    public Car(int cylinders) {
        this.cylinders = cylinders;
        this.currentSpeed = 0;
    }

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    public Double calcolaBollo() {
        return cylinders * 0.75;
    }

}

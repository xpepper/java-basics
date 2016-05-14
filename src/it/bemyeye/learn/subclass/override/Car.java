package it.bemyeye.learn.subclass.override;

class Car {
    int engineDisplacement;
    int currentSpeed;

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }
}

class Taxi extends Car {
    String license;

    @Override
    void accelerate(int speedGain) {
        if (speedGain > 10) {
            currentSpeed += 10;
        } else {
            currentSpeed += speedGain;
        }
    }
}


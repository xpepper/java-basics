package it.bemyeye.learn.subclass;

class Car {
    int cylinderCapacity;
    int speed;

    void accelerate(int value) {
        speed += value;
    }
}

class Taxi extends Car {
    String licence;

    Taxi(String text) {
        this.licence = text;
    }
}

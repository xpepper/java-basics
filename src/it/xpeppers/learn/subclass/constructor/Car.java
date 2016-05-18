package it.xpeppers.learn.subclass.constructor;

class Car {
    int cylinders;
    int speed;

    Car(int cylinders) {
        this(10, cylinders);
    }

    Car(int speed, int cylinders) {
        this.speed = speed;
        this.cylinders = cylinders;
    }
}

class Taxi extends Car {
    String license;

    Taxi(String license) {
        super(1600);
        this.license = license;
    }

    Taxi(String license, int speed, int cylinders) {
        super(speed, cylinders);
        this.license = license;
    }
}

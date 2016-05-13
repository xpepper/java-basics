package it.bemyeye.learn;

class Car {
    int cylinderCapacity;
    int speed;

    Car(int cylinderCapacity, int speed) {
        this.cylinderCapacity = cylinderCapacity;
        this.speed = speed;
    }

    Car(int cylinderCapacity) {
        this(cylinderCapacity, 0);
    }

    void accelerate(int value) {
        this.speed += value;
    }

    void accelerate() {
        speed += 10;
    }
}


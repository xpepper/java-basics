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

    Double billing() {
        return 10.59;
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Taxi();

        car.billing(); // <= errore: non posso chiamare il metodo 'billing' con una variable di tipo Car
        ((Taxi) car).billing(); // <= ...a meno che non faccia un "downcasting"

        car.accelerate(123); // <= qui invece viene chiamato il metodo 'accelerate' di Taxi
        System.err.println(car.currentSpeed);

    }
}
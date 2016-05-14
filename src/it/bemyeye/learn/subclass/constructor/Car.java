package it.bemyeye.learn.subclass.constructor;

class Car {
    int speed;
    int cylinders;

    public Car() {
        this(0,0);
        System.out.println("Building an instance of Car()");
    }

    public Car(int cylinders) {
        this(0, cylinders);
        System.out.println("Building an instance of Car(cylinders)");
    }

    public Car(int speed, int cylinders) {
        this.speed = speed;
        this.cylinders = cylinders;
        System.out.println("Building an instance of Car(speed, cylinders)");
    }

}

class Taxi extends Car {
    String license;

    Taxi() {
        super(123);                       // chiama esplicitamente un costruttore nella classe padre...
        this.license = "DEFAULT LICENSE"; // poi esegue il resto di questo costruttore
        System.out.println("Building an instance of Taxi...");
    }

    Taxi(String license) {
        super(1600);
        this.license = license;
    }

    Taxi(String license, int speed, int cylinders) {
        super(speed, cylinders);
        this.license = license;
    }
}

class Test {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
    }
}
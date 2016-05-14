package it.bemyeye.learn.subclass.constructor;

class Auto {
    int speed;
    int cylinders;

    public Auto() {
        this.speed = 0;
        this.cylinders = 0;
        System.out.println("Building an instance of Auto...");
    }
}

class Taxi extends Auto {
    String license;

    public Taxi() {
        // chiama prima il costruttore vuoto della superclasse (Auto)
        // chiama poi questo costruttore
        this.license = "DEFAULT LICENSE";
        System.out.println("Building an instance of Taxi...");
    }
}

class Test {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
    }
}
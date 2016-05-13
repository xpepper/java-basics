class Car {
    int cylinderCapacity;
    int speed;

    void accelerate(int value) {
        speed += value;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car theCar;
        theCar = new Car();

        theCar.cylinderCapacity = 1200;
        theCar.accelerate(10);

        Car otherCar = theCar;
        System.out.println(theCar.speed);

        theCar.accelerate(10);
        System.out.println(otherCar.speed);

        theCar = null;
        otherCar.accelerate(5);

        Car yetAnotherCar = new Car();
        yetAnotherCar.cylinderCapacity = 2000;
        yetAnotherCar.accelerate(20);

        System.out.println(otherCar.speed);
        System.out.println(yetAnotherCar.speed);
        System.out.println(yetAnotherCar.cylinderCapacity);
    }
}
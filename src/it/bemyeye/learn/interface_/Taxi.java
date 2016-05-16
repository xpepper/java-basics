package it.bemyeye.learn.interface_;

public class Taxi extends Car {
    private String license;

    public Taxi(int engineDisplacement, String license) {
        super(engineDisplacement);
        this.license = license;
    }

    @Override
    public double carTaxes() {
        return super.carTaxes() / 2;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public String librettoDiCircolazione() {
        return "Taxi, circolazione in centro sempre.\n" +
                "Licenza Taxi " + getLicense() + ".\n" +
                "Con cilindrata " + getCylinders() + " e bollo in euro " + carTaxes();
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Taxi(450, "2016-07-01 codice licenza ABC123");
        System.out.println(car.librettoDiCircolazione());

        System.out.println("Car Taxes are: " + car.carTaxes());
    }
}

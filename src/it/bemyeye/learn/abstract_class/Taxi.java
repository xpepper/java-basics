package it.bemyeye.learn.abstract_class;

public class Taxi extends Car {
    private String license;

    public Taxi(int engineDisplacement, String license) {
        super(engineDisplacement);
        this.license = license;
    }

    @Override
    public double calcolaBollo() {
        return super.calcolaBollo() / 2;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public String librettoDiCircolazione() {
        return "Taxi, circolazione in centro sempre.\n" +
                "Licenza Taxi " + getLicense() + ".\n" +
                "Con cilindrata " + cylinders + " e bollo in euro " + calcolaBollo();
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Taxi(450, "2016-07-01 codice licenza ABC123");
        System.out.println(car.librettoDiCircolazione());
    }
}

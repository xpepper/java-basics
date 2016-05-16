package it.bemyeye.learn.exception;

public class CarApp {

    public static void main(String[] args) throws LicenseException {
        int cylinders = 2000;
        String license = "";
        if (args.length == 2) {
            try {
                cylinders = Integer.parseInt(args[0]);
                license = args[1];
            } catch (NumberFormatException ex) {
                System.out.println("formato errato");
            }
        }
        Taxi taxi = new Taxi(cylinders, license);
        stampaImporto(taxi);
    }

    private static void stampaImporto(Taxable taxable) {
        System.out.println("Il bollo per " + taxable + " è pari a euro " + taxable.carTaxes());
    }
}

package it.bemyeye.learn.exception;

public class CarApp {

    public static void main(String[] args) {
        int cilindrata = 2000;
        if (args.length == 2) {
            try {
                cilindrata = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.out.println("formato errato");
            }
        }
        Taxi taxi = new Taxi(cilindrata, "WER78MN");
        stampaImporto(taxi);
    }

    private static void stampaImporto(Taxable taxable) {
        System.out.println("Il bollo per " + taxable + " è pari a euro " + taxable.carTaxes());
    }
}

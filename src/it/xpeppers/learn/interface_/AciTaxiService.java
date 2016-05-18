package it.xpeppers.learn.interface_;

public class AciTaxiService implements TaxService {

    private static double BASIC_BOLLO_TAX_RATE = 0.75;

    @Override
    public double computeTaxFor(int cylinders) {
        return cylinders * BASIC_BOLLO_TAX_RATE;
    }
}

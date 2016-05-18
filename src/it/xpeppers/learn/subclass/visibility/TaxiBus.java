package it.xpeppers.learn.subclass.visibility;

public class TaxiBus extends Taxi {

    public TaxiBus() {
        super(5000);
    }

    @Override
    public void accelerate(int speedGain) {
        speed++;
    }

}

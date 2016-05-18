package it.xpeppers.learn.subclass.visibility.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.xpeppers.learn.subclass.visibility.TaxiBus;

public class TaxiBusTest {

    @Test
    public void test() {
        TaxiBus taxiBus = new TaxiBus();
        taxiBus.accelerate(1000);
        assertEquals(1, taxiBus.getSpeed());
    }

}

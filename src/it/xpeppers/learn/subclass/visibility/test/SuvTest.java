package it.xpeppers.learn.subclass.visibility.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.xpeppers.learn.subclass.visibility.Suv;

public class SuvTest {

    @Test
    public void test() {
        Suv suv = new Suv(1000, 0);
        assertEquals(5, suv.getSpeed());

        suv.accelerate(10);
        assertEquals(20, suv.getSpeed());
    }

}

package it.bemyeye.learn.generics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ReverseArrayTest {

    @Test
    public void reverseAnArray() throws Exception {
        Integer[] array = new Integer[] { 1, 4, 6, 0 };
        Integer[] reversed = new ReverseArray<Integer>(array).reverse();

        assertEquals(new Integer(0), reversed[0]);
        assertEquals(new Integer(6), reversed[1]);
        assertEquals(new Integer(4), reversed[2]);
        assertEquals(new Integer(1), reversed[3]);
    }

    @Test
    public void reversedEmptyArrayIsStillAnEmptyArray() throws Exception {
        Integer[] empty = new Integer[0];
        Integer[] reversed = new ReverseArray<Integer>(empty).reverse();

        assertEquals(0, reversed.length);
    }

    @Test
    public void reversedNullArrayIsStillNull() throws Exception {
        Integer[] reversed = new ReverseArray<Integer>(null).reverse();

        assertNull(reversed);
    }

    @Test
    public void reverseHasNoSideEffectOnInputArray() throws Exception {
        Integer[] array = new Integer[] { 1, 4, 6, 9 };
        new ReverseArray<Integer>(array).reverse();

        assertEquals(new Integer(1), array[0]);
        assertEquals(new Integer(4), array[1]);
        assertEquals(new Integer(6), array[2]);
        assertEquals(new Integer(9), array[3]);
    }
}

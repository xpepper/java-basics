package it.bemyeye.learn.nestedclass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Enumeration;

import org.junit.Test;

public class FixedStackTest {

    @Test
    public void pushAddsElementsToTheStack() {
        FixedStack stack = new FixedStack(5);
        stack.push("first");
        stack.push("second");
        stack.push("third");

        Enumeration elements = stack.elements();

        assertTrue(elements.hasMoreElements());

        assertEquals("third", elements.nextElement());
        assertEquals("second", elements.nextElement());
        assertEquals("first", elements.nextElement());

        assertFalse(elements.hasMoreElements());
    }

}

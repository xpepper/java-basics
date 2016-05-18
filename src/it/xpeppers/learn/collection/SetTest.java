package it.xpeppers.learn.collection;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {

    @Test
    public void elements() throws Exception {
        Set set = new HashSet();
        set.add(new Integer(10));
        set.add(new Integer(1));
        set.add(new Integer(-1));
        set.add(new Integer(1));
        set.add(new Integer(10));

        assertEquals(false, set.isEmpty());

        int expectedSize = 3;
        assertEquals(expectedSize, set.size());

        assertEquals(false, set.contains("10"));
        assertEquals(true, set.contains(1));

        assertEquals(-1, set.iterator().next());

        for (Object each : set) {
            System.out.println(each);
        }
    }
}

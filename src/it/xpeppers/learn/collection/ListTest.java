package it.xpeppers.learn.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class ListTest {

    @Test
    public void listElements() throws Exception {
        Collection list = new ArrayList();
        list.add("ABC");
        list.add(new Integer(10));

        assertEquals(false, list.isEmpty());

        int expectedSize = 2;
        assertEquals(expectedSize, list.size());

        assertEquals(true, list.contains("ABC"));
        assertEquals(false, list.contains("AbC"));

        assertEquals("ABC", list.iterator().next());

        for (Object each : list) {
            System.out.println(each);
        }
    }

}

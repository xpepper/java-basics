package it.xpeppers.learn.collection;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {

    @Test
    public void testElements() throws Exception {
        Map map = new HashMap();
        map.put(21, "Enrico");
        map.put(3, "Anna");
        map.put(51, "Luca");
        map.put(913, "Luca");

        assertEquals(false, map.isEmpty());

        map.remove(21);

        assertEquals(3, map.size());
        assertEquals(true, map.containsKey(913));
        assertEquals(true, map.containsValue("Luca"));

        map.put(913, "Sara");

        assertEquals(3, map.size());
        assertEquals(false, map.containsValue("Enrico"));

        assertEquals(913, map.keySet().iterator().next());
        assertEquals("Sara", map.values().iterator().next());

        Set entrySet = map.entrySet();
        for (Object each : entrySet) {
            System.err.println(each);
        }
    }

}

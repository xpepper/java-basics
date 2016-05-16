package it.bemyeye.learn.nestedclass;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class FixedStack {

    private Object array[];
    private int top = 0;

    public FixedStack(int fixedSizeLimit) {
        array = new Object[fixedSizeLimit];
    }

    public void push(Object item) {
        array[top++] = item;
    }

    // other stack methods go here...
    // pop() extracts the topmost element
    // isEmpty() …


    class Enumerator implements Enumeration {
        int count = top;

        @Override
        public boolean hasMoreElements() {
            return count > 0;
        }

        @Override
        public Object nextElement() {
            if (count == 0) { throw new NoSuchElementException("FixedStack");  }
            return array[--count];
        }
    }

    public Enumeration elements() {
        return new Enumerator();
    }
}


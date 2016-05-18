package it.xpeppers.learn.nestedclass;

import java.util.Enumeration;

public class StackApp {
    public static void main(String[] args) {
        FixedStack stack = new FixedStack(10);
        stack.push("first");
        stack.push("second");
        stack.push("third");

        Enumeration elements = stack.elements();
        while (elements.hasMoreElements()) {
            System.err.println(elements.nextElement());
        }

    }
}

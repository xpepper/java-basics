package it.bemyeye.learn.through_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingCharTest {
    //  Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    @Test
    public void removeTheCharAtTheGivenIndex() throws Exception {
        assertEquals("ktten", new MissingChar().removeCharFrom("kitten", 1));
        assertEquals("itten", new MissingChar().removeCharFrom("kitten", 0));
        assertEquals("kittn", new MissingChar().removeCharFrom("kitten", 4));
    }
}

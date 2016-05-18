package it.xpeppers.learn.kata.stringcalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

public class StringCalculatorTest {

    @Test @Ignore
    public void emptyStringAddsToZero() throws Exception {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test @Ignore
    public void stringWithOneNumberAddsTheSameNumber() throws Exception {
        assertEquals(3, StringCalculator.add("3"));
    }

    @Test @Ignore
    public void stringWithAnyAmountOfNumbersSeparatedByCommasAddsToTheSumOfAllTheNumbers() throws Exception {
        assertEquals(10, StringCalculator.add("1,2,3,4"));
    }

    @Test @Ignore
    public void newlineIsAnAllowedNumberDelimiter() throws Exception {
        assertEquals(6, StringCalculator.add("1,2\n3"));
    }

    @Test @Ignore
    public void supportsCustomDelimiters() throws Exception {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test @Ignore
    public void stringWithCustomerDelimiterAndNoNumersAddsToZero() throws Exception {
        assertEquals(0, StringCalculator.add("//;\n"));
    }

    @Test(expected = Exception.class) @Ignore
    public void throwsExceptionForNegativeNumbers() throws Exception {
        StringCalculator.add("1,2,-3");
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test @Ignore
    public void throwsExceptionForNegativeNumbersWithProperMessage() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("negatives not allowed: [-3]");

        StringCalculator.add("1,2,-3");
    }

    @Test @Ignore
    public void throwsExceptionForNegativeNumbersWithMessageShowingAllTheInvalidNumbers() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("negatives not allowed: [-3, -23]");

        StringCalculator.add("1,2,-3,5,-23");
    }

}

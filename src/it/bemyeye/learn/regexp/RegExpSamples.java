package it.bemyeye.learn.regexp;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegExpSamples {

    @Test
    public void replaceAllOccurrences() {
        String text = "C'era una volta Java1, poi Java2... ora siamo a Java8!";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("1000");

        assertEquals("C'era una volta Java1000, poi Java1000... ora siamo a Java1000!", result);
    }

    @Test
    public void findAllOccurrences() {
        List<String> occurrences = new ArrayList<>();

        String text = "C'era una volta Java1, poi Java2... ora siamo a Java8!";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            occurrences.add(text.substring(matcher.start(), matcher.end()));
        }

        assertEquals(asList("1", "2", "8"), occurrences);
    }

}

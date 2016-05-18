package it.xpeppers.learn.functional;

import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach {

    public static void main(String[] args) {
        new NamePrinter().print("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        new CaseConverter().toLower("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    }

}

class NamePrinter {
    public void print(String... names) {
        Arrays.asList(names).forEach(System.out::println);
    }
}

class CaseConverter {

    public void toLower(String...strings) {
        Arrays.asList(strings).stream().map(s -> s.toLowerCase()).forEach(System.out::println);
    }
}


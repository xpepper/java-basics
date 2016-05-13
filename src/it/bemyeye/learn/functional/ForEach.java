package it.bemyeye.learn.functional;

import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach {

    public static void main(String[] args) {
        new NamePrinter().print("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    }

}

class NamePrinter {

    public void print(String... names) {
        Arrays.asList(names).forEach(printToSystemConsole());

    }

    private Consumer<String> printToSystemConsole() {
        return string -> System.out.println(string);
    }

}


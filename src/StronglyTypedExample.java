
public class StronglyTypedExample {

    public static void main(String[] args) {
        // name = "Piero"; // Java is statically typed!
        String name = "piero"; // OK...

        // name = 12;// Java is strongly-typed! (see dynamic/late vs early binding)
        name = "Paolo"; // OK
    }
}

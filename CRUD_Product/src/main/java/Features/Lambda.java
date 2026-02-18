package Features;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String args[]) {
        List<String> name = Arrays.asList("Dog", "Cat", "Cow");
        name.forEach(nm -> System.out.println(nm));
    }
}

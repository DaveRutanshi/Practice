package Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String []args)
    {
        List<String> names= Arrays.asList("John","Rocky","Jhonny","Tom");
        List<String> filterednames=names.stream().filter(name->name.startsWith("J")).collect(Collectors.toList());
        System.out.println(filterednames);
    }
}

package Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String []args)
    {
        List<String> names= Arrays.asList("ABC","DEF","GHI");
        names.forEach(nm->System.out.println(nm));  //Lambda Expression
        names.forEach(System.out::println);        //Method Reference

        //With Stream
        Stream<Integer> number= Stream.of(1,2,3,4,5,6);
        number.forEach(num->System.out.println(num));
    }
}

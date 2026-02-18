package Features;

import java.util.Optional;

public class OptionalClass {
    public static void main(String []args)
    {
        Optional<String> example=Optional.of("Hello Optional");
        System.out.println(example.get());

        Optional<Integer> example1=Optional.ofNullable(12);
        Integer result=example1.orElse(15);
        System.out.println(result);
    }
}
package Features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReference {
    public static void StaticExample(String Message)
    {
        System.out.println("Static Method "+Message);
    }

    public static void main(String []args)
    {
        MethodReference example=new MethodReference();
        Consumer<String> con=MethodReference::StaticExample;
        con.accept("Hello World");
        BiConsumer<Integer,Integer> con2=example::Math;
        con2.accept(12,14);
    }

    public void Math(int a,int b)
    {
        System.out.println("Addition Is-->"+(a+b));
    }

}

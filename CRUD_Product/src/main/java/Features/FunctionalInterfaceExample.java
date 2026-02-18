package Features;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface functional
{
    int operation(int a,int b);
}
public class FunctionalInterfaceExample {
    public static void main(String [] args)

    {
        functional add = (a, b) -> a + b;

        System.out.println(add.operation(12,18));
    }
}

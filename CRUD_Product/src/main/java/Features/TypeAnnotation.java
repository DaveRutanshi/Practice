package Features;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE,ElementType.TYPE_PARAMETER})
@interface NonNUll{}
public class TypeAnnotation {
    public static void main(String args[])
    {
        @NonNUll String notNullString="";
    }
}

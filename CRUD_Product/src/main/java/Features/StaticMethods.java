package Features;

interface MathOperations
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static boolean isEmpty(String str)
    {
        return str==null||str.isEmpty();
    }
    static String concatenate(String str1,String str2)
    {
        return str1+str2;
    }
}
public class StaticMethods {

    public static void main(String []args)
    {
        System.out.println("Addition Is:---->"+MathOperations.add(10,20));
        System.out.println("Multiplication Is:----->"+MathOperations.mul(23,89));
        String testString="";
        System.out.println("Is The String Empty-->"+MathOperations.isEmpty(testString));
        System.out.println("Concatenate To Strings--->"+MathOperations.concatenate("Dave ","Rutanshi"));
    }
}

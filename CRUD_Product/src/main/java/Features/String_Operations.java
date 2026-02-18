package Features;

public class String_Operations {
    public static void main(String []args) throws InterruptedException {
//        String str = "Hello";
//        str.concat("World");
//        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder(" ");
//        sb.append("World");
//        System.out.println(sb);

        StringBuffer SB = new StringBuffer();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                SB.append(i);
            }
        };
        Thread T1=new Thread(task);
        Thread T2=new Thread(task);

        T1.start();
        T2.start();

        T1.join();
        T2.join();

        System.out.print(SB);
    }
}

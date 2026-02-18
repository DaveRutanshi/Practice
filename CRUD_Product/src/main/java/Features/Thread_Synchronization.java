package Features;

class Counter
{
    private int count=0;
    public synchronized void incremenet(){
        count ++;
    }
    public int getCount(){
        return count;
    }
}
public class Thread_Synchronization {
    public static void main(String []args) throws InterruptedException {
        Counter cou=new Counter();

        Thread t1=new Thread(()->{
            for (int i=0;i<1000;i++){
                cou.incremenet();
            }
        });

        Thread t2=new Thread(()->{
            for (int i=0;i<1000;i++){
                cou.incremenet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count::-->"+cou.getCount());
    }
}

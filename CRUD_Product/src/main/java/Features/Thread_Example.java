package Features;

class MyThread extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread Running....");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread Finished.");
    }
}
public class Thread_Example {
    public static void main(String []args) throws InterruptedException {
        Thread t1=new MyThread();
        System.out.println("Thread State:"+t1.getState());
        t1.start();
        System.out.println("Thread State:"+t1.getState());
        Thread.sleep(500);
        System.out.println("Thread State:"+t1.getState());
        t1.join();
        System.out.println("Thread State:"+t1.getState());
    }
}

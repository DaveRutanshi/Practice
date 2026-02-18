package Features;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Service {
    public static void main(String args[])
    {
        ExecutorService service = (ExecutorService) Executors.newFixedThreadPool(5);
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName());
        };
        service.submit(task);
        service.submit(task);
        service.submit(task);

        service.shutdown();
    }
}

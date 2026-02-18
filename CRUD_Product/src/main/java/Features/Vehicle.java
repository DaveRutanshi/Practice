package Features;

public interface Vehicle {
    void start();

    default void stop()
    {
        System.out.println("Vehicle Stopped");
    }
}

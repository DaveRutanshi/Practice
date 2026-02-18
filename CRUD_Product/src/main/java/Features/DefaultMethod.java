package Features;

class Car implements Vehicle{
    public void start()
    {
        System.out.println("Vehicle Started");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");
    }
}
public class DefaultMethod{
    public static void main(String []args)
    {
        Vehicle car=new Car();
        car.start();
        car.stop();

        Vehicle bike=new Bike();
        bike.start();
        bike.stop();
    }
}

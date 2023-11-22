package OOPs.Module3.Part2.Task1;

public class Bus implements Vehicle {
    private  String type;
    private String fuel;
    private  Integer capacity;

    public Bus(String type, String fuel, Integer capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return String.format("Bus Information:\nType: %s\nFuel: %s\nCapacity: %d Passengers", type, fuel, capacity);
    }
}

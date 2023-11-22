package OOPs.Module3.Part2.Task3;

public class Bus extends AbstractVehicle {
    private  Integer capacity;

    public Bus(String type, String fuel,String colour,  Integer capacity) {
        super(type, fuel, colour);
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
        return String.format("Bus Information:\nType: %s\nFuel: %s\nColour: %s\nCapacity: %d Passengers", type, fuel, colour, capacity);
    }

    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating...");
    }

    @Override
    public void honk() {
        System.out.println("Bus is honking...");
    }
}

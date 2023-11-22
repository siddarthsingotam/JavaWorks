package OOPs.Module3.Part2.Task3;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel, color);
    }

    @Override
    public void accelerate() {
        System.out.printf("Bike %s is accelerating\n", type);
    }

    @Override
    public void honk() {
        System.out.printf("Bike %s is honking!\n", type);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    @Override
    public String getInfo() {
        return String.format("Motorcycle Information:\nType: %s\nFuel: %s\nColour: %s", type, fuel, colour);
    }
}


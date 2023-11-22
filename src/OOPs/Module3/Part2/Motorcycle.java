package OOPs.Module3.Part2;

public class Motorcycle implements Vehicle {
    private String type;
    private String fuel;
    private String colour;

    public Motorcycle(String type, String fuel, String colour) {
        this.type = type;
        this.fuel = fuel;
        this.colour = colour;
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


package OOPs.Module3.Part2.Task3;

public class Car extends AbstractVehicle {

    // private static String type;
    // private static String fuel;
    // private static String colour;

    public Car(String type, String fuel, String colour) {
        super(type, fuel, colour);
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating! Vroom");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking! Peep");
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String getInfo() {
        return String.format("Car Information:\nType: %s\nFuel: %s\nColour: %s", type, fuel, colour);
    }
}

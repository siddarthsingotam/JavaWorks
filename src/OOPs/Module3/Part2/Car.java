package OOPs.Module3.Part2;

import java.sql.SQLOutput;

public class Car implements Vehicle {
    private static String type;
    private static String fuel;
    private static String colour;

    public Car(String type, String fuel, String colour) {
        this.type = type;
        this.fuel = fuel;
        this.colour = colour;
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

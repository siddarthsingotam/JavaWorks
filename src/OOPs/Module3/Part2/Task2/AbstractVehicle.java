package OOPs.Module3.Part2.Task2;

public abstract class AbstractVehicle implements Vehicle{
    public String type;
    public String fuel;
    public String colour;

    public AbstractVehicle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.colour = color;
    }

    // Additional abstract method to be implemented by subclasses
    public abstract void accelerate();

    public abstract void honk();

}

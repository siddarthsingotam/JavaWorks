package OOPs.Module3.Part2.Task3;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
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

    @Override
    public void charge() {
        if ("Electric".equals(fuel) || "electric".equals(fuel)){
            System.out.println("Charging the electric vehicle.");
        } else {
            System.out.println("Not possible to charge. This is not an electric vehicle.");
        }
    }
}

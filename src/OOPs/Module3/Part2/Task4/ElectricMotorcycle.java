package OOPs.Module3.Part2.Task4;

public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String type, String color) {
        super(type, "Electric", color, 0);
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Motorcycle is accelerating!");
    }

    @Override
    public void honk() {
        System.out.println("Electric Motorcycle is honking!");
    }

    @Override
    public void start() {
        System.out.println("Electric Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric Motorcycle is stopping");
    }

    @Override
    public String getInfo() {
        return String.format("Motorcycle Information:\nType: %s\nFuel: %s\nColour: %s", type, "Electric", colour);

    }
}

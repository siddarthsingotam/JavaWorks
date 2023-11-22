package OOPs.Module3.Part2.Task3;

public class ElectricCar extends AbstractVehicle{
    public ElectricCar(String type, String color) {
        super(type, "Electric", color);
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating!");
    }

    @Override
    public void honk() {
        System.out.println("Electric car is honking!");
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping");
    }

    @Override
    public String getInfo() {
        return String.format("Car Information:\nType: %s\nFuel: %s\nColour: %s", type, "Electric", colour);

    }

    @Override
    public void charge() {
        super.charge();
    }
}

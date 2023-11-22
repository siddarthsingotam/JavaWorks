package OOPs.Module3.Part2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Petrol", "Dark green");
        Motorcycle bike1 = new Motorcycle("Harley", "Petrol", "Black");
        Bus bus1 = new Bus("Scania", "Diesel", 48);

        System.out.println("Vehicle Demo: \n");

        car1.start();
        car1.stop();
        System.out.println(car1.getInfo()+ "\n");

        bike1.start();
        bike1.stop();
        System.out.println(bike1.getInfo()+ "\n");

        bus1.start();
        bus1.stop();
        System.out.println(bus1.getInfo()+ "\n");
    }
}

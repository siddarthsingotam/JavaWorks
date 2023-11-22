package OOPs.Module3.Part2.Task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Petrol", "Dark green", 11);
        Motorcycle bike1 = new Motorcycle("Harley", "Petrol", "Black", 23);
        Bus bus1 = new Bus("Scania", "Diesel", "blue", 48, 13);
        ElectricCar ev1 = new ElectricCar("Polaris", "White");
        ElectricMotorcycle evm1 = new ElectricMotorcycle("Aether", "Yellow");

        System.out.println("Vehicle Demo: \n");

        car1.start();
        car1.stop();
        car1.charge();
        System.out.println(car1.calculateEfficiency());
        System.out.println(car1.getInfo()+ "\n");

        bike1.start();
        bike1.accelerate();
        bike1.charge();
        System.out.println(bike1.getInfo()+ "\n");

        ev1.start();
        ev1.accelerate();
        ev1.charge();
        System.out.println(ev1.calculateEfficiency());
        System.out.println(ev1.getInfo()+ "\n");

        evm1.start();
        evm1.accelerate();
        evm1.charge();
        System.out.println(evm1.getInfo()+ "\n");
    }
}

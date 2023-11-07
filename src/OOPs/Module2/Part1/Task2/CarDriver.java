package OOPs.Module2.Part1.Task2;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 200, 55, 40, 160);
        myCar.fillTank();

        // test acceleration until top speed limit
        for(int i = 0; i < (myCar.topSpeed/10); i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Test turning on cruise control
        if (myCar.turnOnCruiseControl(100)) {
            System.out.println("Cruise control is on at " + myCar.getSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be turned on.");
        }

        // Decelerate car from top speed with cruise control
        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Turn off cruise control
        myCar.turnOffCruiseControl();
        System.out.println("Cruise control turned off.");


    }
}


package OOPs.Module2.Part1.Task3;

import java.util.Scanner;

public class CoffeeMakerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMakerN coffeeMaker = new CoffeeMakerN("normal", 50);

        while (true) {
            System.out.println("Coffee Maker Menu:");
            System.out.println("1. Toggle Power On/Off");
            System.out.println("2. Set Coffee Type");
            System.out.println("3. Set Coffee Amount");
            System.out.println("4. Get Current Status");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffeeMaker.pressOnOff();
                    System.out.println("Power status: " + (coffeeMaker.isOn() ? "On" : "Off"));
                    break;
                case 2:
                    System.out.print("Enter coffee type (normal/espresso): ");
                    String type = scanner.next();
                    coffeeMaker.setCoffeeType(type);
                    break;
                case 3:
                    System.out.print("Enter coffee amount (10-80 grams): ");
                    int amount = scanner.nextInt();
                    coffeeMaker.setCoffeeAmount(amount);
                    break;
                case 4:
                    System.out.println("Power status: " + (coffeeMaker.isOn() ? "On" : "Off"));
                    System.out.println("Coffee Type: " + coffeeMaker.getCoffeeType());
                    System.out.println("Coffee Amount: " + coffeeMaker.getCoffeeAmount() + " grams");
                    break;
                case 5:
                    System.out.println("Exiting the Coffee Maker program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

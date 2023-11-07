package OOPs.Module2.Part1.Task3;

public class CoffeeMakerN {
    private String coffeeType;
    private int coffeeAmount;
    private boolean powerStatus;

    public CoffeeMakerN(String coffeeType, int coffeeAmount) {
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
        powerStatus = false;
    }

    public boolean isOn() {
        return powerStatus;
    }

    public void pressOnOff() {
        powerStatus = !powerStatus;
    }

    public void setCoffeeAmount(int coffee) {
        if (powerStatus && coffee >= 10 && coffee <= 80) {
            coffeeAmount = coffee;
        } else {
            System.out.println("Invalid coffee amount. It must be between 10 and 80 grams, and the coffee maker should be turned on.");
        }
    }

    public void setCoffeeType(String type) {
        if (powerStatus) {
            coffeeType = type;
        } else {
            System.out.println("The coffee maker is off. Turn it on to change the coffee type.");
        }
    }

    // Additional method to get the current coffee type
    public String getCoffeeType() {
        return coffeeType;
    }

    // Additional method to get the current coffee amount
    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}


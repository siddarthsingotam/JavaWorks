package OOPs.Module2.Part1;

import java.util.Objects;

public class CoffeeMaker {
    private String coffeeType;
    private int coffeeAmount;
    private boolean powerStatus;

    public CoffeeMaker(String coffeeType, int coffeeAmount) {
        powerStatus = false;
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
    }

    public boolean isOn() {
        return powerStatus = true;
    }

    // Pressing on off
    public void pressOnOff() {
        if (!powerStatus) {
            powerStatus = false;
        } else {
            powerStatus = true;
        }
    }

    // Setting the amount of coffee required
    public void setCoffeeAmount(int coffee) {
        if (10 <= coffee && coffee <= 80){
            this.coffeeAmount = coffee;
        }
        else{
            System.out.println("Exceeded coffee limit 10-80g");
        }
    }

    // Setting up coffee type
    public void setCoffeeType(String type){
        coffeeType = type;
    }
}

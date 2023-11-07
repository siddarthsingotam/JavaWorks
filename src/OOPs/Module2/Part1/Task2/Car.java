package OOPs.Module2.Part1.Task2;

/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float gasolineLevel;
    private String typeName;
    public float topSpeed;
    private float gasolineCapacicty;
    private boolean cruiseControlOn;
    private float targetSpeed;
    private float minCruiseSpeed;
    private float maxCruiseSpeed;



    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName, float topSpeed, float gasolineCapacicty, float minCruiseSpeed, float maxCruiseSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
        this.topSpeed = topSpeed;
        this.gasolineCapacicty = gasolineCapacicty;
        cruiseControlOn = false;
        this.targetSpeed = 0;
        this.minCruiseSpeed = minCruiseSpeed;
        this.maxCruiseSpeed = maxCruiseSpeed;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0 && gasolineCapacicty >= gasolineLevel && speed <= topSpeed)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = gasolineCapacicty;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    public boolean turnOnCruiseControl(float targetSpeed) {
        if (targetSpeed >= minCruiseSpeed && targetSpeed <= maxCruiseSpeed && speed >= minCruiseSpeed) {
            this.speed = targetSpeed;
            cruiseControlOn = true;
            return true;
        } else {
            cruiseControlOn = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public float getTargetSpeed() {
        return targetSpeed;
    }
}


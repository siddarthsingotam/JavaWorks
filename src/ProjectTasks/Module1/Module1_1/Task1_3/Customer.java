package ProjectTasks.Module1.Module1_1.Task1_3;

public class Customer {
    private static int lastCustomerId = 0;

    private int id;
    private long startTime;
    private long endTime;

    // Constructor
    public Customer() {
        this.id = ++lastCustomerId;
        this.startTime = System.currentTimeMillis();
        // Set a default end time; can be updated later
        this.endTime = startTime;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter and Setter for startTime
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Getter and Setter for endTime
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Method to calculate and return the time spent by the customer
    public long getTimeSpent() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Test program to demonstrate the functionality of the Customer class
        Customer customer1 = new Customer();
        System.out.println("Customer " + customer1.getId() + " created at time: " + customer1.getStartTime());

        // Simulate some time passing
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update the end time for the customer
        customer1.setEndTime(System.currentTimeMillis());
        System.out.println("Customer " + customer1.getId() + " ended at time: " + customer1.getEndTime());
        System.out.println("Customer " + customer1.getId() + " spent " + customer1.getTimeSpent() + " milliseconds.");
    }
}

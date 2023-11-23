package ProjectTasks.Module1.Module1_1.Task1_6;

public class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            Customer newCustomer = new Customer(System.nanoTime());
            servicePoint.addToQueue(newCustomer);
            System.out.println("Customer " + newCustomer.getId() + " added to the queue.");
        }
    }
}


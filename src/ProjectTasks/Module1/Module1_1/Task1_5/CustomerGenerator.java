package ProjectTasks.Module1.Module1_1.Task1_5;

public class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            servicePoint.addToQueue(new Customer(System.currentTimeMillis()));
        }
    }
}

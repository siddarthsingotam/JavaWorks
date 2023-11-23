package ProjectTasks.Module1.Module1_1.Task1_5;

public class SinglePointOfServiceSystem {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numberOfCustomers = 5;

        // Generate customers and add them to the queue
        CustomerGenerator.generateCustomers(servicePoint, numberOfCustomers);

        // Serve customers
        servicePoint.serve();
    }
}


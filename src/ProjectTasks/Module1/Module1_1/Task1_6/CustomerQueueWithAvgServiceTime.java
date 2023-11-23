package ProjectTasks.Module1.Module1_1.Task1_6;

public class CustomerQueueWithAvgServiceTime {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numberOfCustomers = 5;

        // Generate customers and add them to the queue
        CustomerGenerator.generateCustomers(servicePoint, numberOfCustomers);

        // Calculate and print average service time
        double averageServiceTime = servicePoint.getAverageServiceTime();
        System.out.println("Average Service Time (before serving): " + averageServiceTime + " milliseconds");

        // Serve customers
        servicePoint.serve();

        // Calculate and print updated average service time
        averageServiceTime = servicePoint.getAverageServiceTime();
        System.out.println("Average Service Time (after serving): " + averageServiceTime + " milliseconds");
    }
}

package ProjectTasks.Module1.Module1_1.Task1_5;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        queue.addLast(customer);
    }

    public Customer removeFromQueue() {
        return queue.removeFirst();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long serviceTime = (long) (Math.random() * 1000); // Simulating service time (in milliseconds)

            System.out.println("Customer " + customer.getId() +
                    " served. Response time: " + (System.currentTimeMillis() - customer.getArrivalTime() + serviceTime) +
                    " milliseconds. Service time: " + serviceTime + " milliseconds.");

            try {
                Thread.sleep(serviceTime); // Simulating service time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

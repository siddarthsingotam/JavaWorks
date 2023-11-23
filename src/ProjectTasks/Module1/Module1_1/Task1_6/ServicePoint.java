package ProjectTasks.Module1.Module1_1.Task1_6;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime;

    public void addToQueue(Customer customer) {
        queue.addLast(customer);
    }

    public Customer removeFromQueue() {
        return queue.removeFirst();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long serviceTime = (long) (Math.random() * 1000);

            customer.setServiceTime(serviceTime);
            totalServiceTime += serviceTime;

            System.out.println("Customer " + customer.getId() +
                    " served. Response time: " + (System.currentTimeMillis() - customer.getArrivalTime() + serviceTime) +
                    " milliseconds. Service time: " + serviceTime + " milliseconds.");

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getAverageServiceTime() {
        if (queue.isEmpty() && totalServiceTime == 0) {
            return 0;
        }
        return (double) totalServiceTime / queue.size();
    }
}


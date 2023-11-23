package ProjectTasks.Module1.Module1_1.Task1_4;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueue {
    public static void main(String[] args) {
        LinkedList<Customer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue a customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Customer newCustomer = new Customer(System.nanoTime());
                    customerQueue.addFirst(newCustomer);
                    System.out.println("Customer " + newCustomer.getId() + " added to the queue.");
                    break;

                case 2:
                    if (!customerQueue.isEmpty()) {
                        Customer removedCustomer = customerQueue.removeLast();
                        long timeSpentInQueue = System.nanoTime() - removedCustomer.getArrivalTime();
                        System.out.println("Customer " + removedCustomer.getId() +
                                " removed from the queue. Time spent in the queue: " + timeSpentInQueue + " nanoseconds.");
                    } else {
                        System.out.println("Queue is empty. No customers to dequeue.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}



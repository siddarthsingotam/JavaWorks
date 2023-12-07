package Exercise_5_2.Task1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketReservationSystem {
    private static final int TOTAL_SEATS = 10;
    private static int availableSeats = TOTAL_SEATS;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            Thread customerThread = new Thread(new Customer(i));
            customerThread.start();
        }
    }

    static class Customer implements Runnable {
        private int customerId;

        public Customer(int customerId) {
            this.customerId = customerId;
        }

        @Override
        public void run() {
            int requestedSeats = (int) (Math.random() * 5) + 1; // Randomly request between 1 to 5 seats

            reserveSeats(requestedSeats);
        }

        private void reserveSeats(int requestedSeats) {
            lock.lock();
            try {
                if (availableSeats >= requestedSeats) {
                    availableSeats -= requestedSeats;
                    System.out.println("Customer " + customerId + " reserved " + requestedSeats + " tickets.");
                } else {
                    System.out.println("Customer " + customerId + " couldn't reserve " + requestedSeats + " tickets.");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


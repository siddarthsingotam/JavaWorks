package Exercise_5_2.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeArrayList<T> {
    private List<T> internalList = new ArrayList<>();
    private Object lock = new Object();

    public void addElement(T element) {
        synchronized (lock) {
            internalList.add(element);
        }
    }

    public int getSize() {
        synchronized (lock) {
            return internalList.size();
        }
    }

    public void removeElement(T element) {
        synchronized (lock) {
            internalList.remove(element);
        }
    }
}

public class ThreadSafeArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeArrayList<String> threadSafeList = new ThreadSafeArrayList<>();

        // Create multiple threads to test thread safety
        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                threadSafeList.addElement("Element" + i);
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                threadSafeList.addElement("Element" + i);
            }
        });

        Thread removeThread = new Thread(() -> {
            // Sleep to ensure that addThread1 and addThread2 have started adding elements
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 3; i++) {
                threadSafeList.removeElement("Element" + i);
            }
        });

        // Start the threads
        addThread1.start();
        addThread2.start();
        removeThread.start();

        // Wait for all threads to finish
        addThread1.join();
        addThread2.join();
        removeThread.join();

        // Print the final size of the list
        System.out.println("Final Size: " + threadSafeList.getSize());
    }
}


package Exercise_5_2.Task2;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeArrayList<T> {
    private List<T> internalList = new ArrayList<>();
    private final Object lock = new Object();

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

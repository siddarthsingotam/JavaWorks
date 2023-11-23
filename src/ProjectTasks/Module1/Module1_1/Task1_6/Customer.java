package ProjectTasks.Module1.Module1_1.Task1_6;

public class Customer {
    private static int lastCustomerId = 0;

    private int id;
    private long arrivalTime;
    private long serviceTime;

    public Customer(long arrivalTime) {
        this.id = ++lastCustomerId;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return id;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public long getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }
}

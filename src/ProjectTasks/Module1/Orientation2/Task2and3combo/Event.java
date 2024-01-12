package ProjectTasks.Module1.Orientation2.Task2and3combo;

public class Event implements Comparable<Event> {
    private double eventTime;
    private EventType eventType;

    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public double getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event otherEvent) {
        return Double.compare(this.eventTime, otherEvent.eventTime);
    }
}

package ProjectTasks.Module1.Orientation2.Task2and3combo;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        this.eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll();
    }

    public boolean isEmpty() {
        return eventQueue.isEmpty();
    }

    public void printEventList() {
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("Event Type: " + event.getEventType() + ", Event Time: " + event.getEventTime());
        }
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Generate a list of events
        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(3.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));

        // Remove and print the first event
        Event firstEvent = eventList.getNextEvent();
        System.out.println("First Event Type: " + firstEvent.getEventType() + ", Event Time: " + firstEvent.getEventTime());

        // Print the contents of the EventList ordered by event time
        eventList.printEventList();
    }
}


package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventNotifier {

    private List<EventObserver> eventObservers;

    public EventNotifier() {
        this.eventObservers = new ArrayList<>();
    }

    public void addEventObserver(EventObserver eventObserver) {
        eventObservers.add(eventObserver);
    }

    public void removeEventObserver(EventObserver eventObserver) {
        System.out.println("This method would remove event observers");
    }

    public void notifyAll(Event event) {
        for (EventObserver eventObserver : eventObservers) {
            eventObserver.update(event);
        }
    }
}

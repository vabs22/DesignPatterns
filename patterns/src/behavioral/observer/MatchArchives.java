package behavioral.observer;

public class MatchArchives implements EventObserver {

    public void update(Event event) {
        System.out.println("Inside MatchArchives update, got event with id: " + event.getId());
    }

    public void getMatchArchives() {
        System.out.println("Inside getMatchArchives, returning match archive");
    }
}

package behavioral.observer;

public class PlayerStats implements EventObserver {

    public void update(Event event) {
        System.out.println("Inside PlayerStats update, got event with id: " + event.getId());
    }

    public void getPlayerStats() {
        System.out.println("Inside getPlayerStats, returning stats of players");
    }
}

package behavioral.observer;

public class ScoreboardSummary implements EventObserver {

    public void update(Event matchEvent) {
        System.out.println("Inside ScoreboardSummary update, got event with id: " + matchEvent.getId());
    }

    public void getScoreSummary() {
        System.out.println("Inside getScoreSummary, returning score summary");
    }
}

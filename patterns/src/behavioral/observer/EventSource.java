package behavioral.observer;

public class EventSource {

    public static void main(String args[]) {
        Event event = new Event(3);

        ScoreboardSummary scoreboardSummary = new ScoreboardSummary();
        PlayerStats playerStats = new PlayerStats();
        MatchArchives matchArchives = new MatchArchives();

        System.out.println("Initialised various observers");

        EventNotifier notifier = new EventNotifier();
        notifier.addEventObserver(scoreboardSummary);
        notifier.addEventObserver(playerStats);
        notifier.addEventObserver(matchArchives);

        System.out.println("Initialised notifier and added observers to it");

        notifier.notifyAll(event);

        System.out.println("Notified all the observers");
    }
}
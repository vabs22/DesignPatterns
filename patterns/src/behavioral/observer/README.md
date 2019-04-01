Observer pattern

Problem:
1. implement cricket scoreboard.
2. An event would be generated, which would contain all the details which happened
on that ball, like number of runs scored, number of wickets, who scored the runs, who bowled the delivery, who
caught the ball, who was involved in the run out, how was the wicket taken, extras scored on the ball, etc. Basically
this event would contain every detail required
3. The number of balls bowled, who is on strike, current score, score of various batsmen, etc would have to be mantained
by the app.



This is a clear use case for observer pattern. We can define various entities for maintaining data, like one entity for
maintaining current score summary, one for maintaining complete score, one for storing the details as archive etc.

The app would get the event and would notify all the entities about it. Then the entities would be responsible for
updating their data themselves. This way they would remain independent and loosely coupled, along with storing
their own data.


output:

Initialised various observers
Initialised notifier and added observers to it
Inside ScoreboardSummary update, got event with id: 3
Inside PlayerStats update, got event with id: 3
Inside MatchArchives update, got event with id: 3
Notified all the observers

Process finished with exit code 0
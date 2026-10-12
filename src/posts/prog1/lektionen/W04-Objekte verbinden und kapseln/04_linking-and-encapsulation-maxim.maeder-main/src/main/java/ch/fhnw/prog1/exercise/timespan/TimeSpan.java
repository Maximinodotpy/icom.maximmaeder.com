package ch.fhnw.prog1.exercise.timespan;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int totalMinutes() {
        return hours * 60 + minutes;
    }
}

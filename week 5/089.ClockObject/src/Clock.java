
public class Clock {

    private final BoundedCounter hours;
    private final BoundedCounter minutes;
    private final BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);

    }

    public void tick() {
        // Clock advances by one second
        this.seconds.next();
            if (this.seconds.getValue() == 0) {
                this.minutes.next();
                if (this.minutes.getValue() == 0) {
                    this.hours.next();
				//above 2 lines do NOT run unless seconds + minutes ==0
                }
            }
    }

    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}

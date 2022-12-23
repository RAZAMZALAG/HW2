public class Clock {
    private int hours;
    private int minutes;
    private final  int MINUTES_PER_HOUR = 60;
    private final int MAX_HOURS_PER_DAY = 24;

    //constructor
    public Clock(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
        if (hours < 0 || hours >= MAX_HOURS_PER_DAY ){
            this.hours = 0;
        }
        if (minutes < 0 || minutes >= MINUTES_PER_HOUR ){
            this.minutes = 0;
        }

    }


    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)){
            return false;
        }
        if (!(other.getClass().getSimpleName() == this.getClass().getSimpleName())){
            return false;
        }
        Clock otherClock = (Clock) other;
        return otherClock.hours == this.hours && otherClock.minutes == this.minutes;

    }


    @Override
    public int hashCode() {
        return MINUTES_PER_HOUR * hours + minutes;
    }

    @Override
    public String toString() {
        if (hours<10 && minutes<10) {
            return "0" + hours + ":0" + minutes;
        }
        if (hours>9 && minutes<10) {
            return hours + ":0" + minutes;
        }
        if (hours<10 && minutes>9) {
            return "0" + hours + ":" + minutes;
        }
        return hours + ":" + minutes;
    }

}

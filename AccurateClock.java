public class AccurateClock extends Clock{
    private int seconds;
    private final int SECONDS_PER_MINUTE = 60;

    public AccurateClock(int hours, int minutes, int seconds) {
        super(hours, minutes);
        this.seconds = seconds;
        if (seconds<0 || seconds>59){
            this.seconds = 0;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)){
            return false;
        }
        if (!(super.equals(other))){
            return false;
        }
        AccurateClock otherAccurateClock = (AccurateClock) other;
        return otherAccurateClock.seconds == this.seconds;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * SECONDS_PER_MINUTE) + seconds;
    }

    @Override
    public String toString() {
        if (seconds < 10) {
            return super.toString() + ":0" + seconds;
        }
        return super.toString() + ":" + seconds;
    }
}

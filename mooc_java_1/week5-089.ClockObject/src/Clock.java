
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        BoundedCounter newhours = new BoundedCounter(23);                       // These are the upper limits of the hours , mins and seconds . If it crosses this, it gets reset
        BoundedCounter newmins = new BoundedCounter(59);
        BoundedCounter newsecs = new BoundedCounter(59);
        newhours.setValue(hoursAtBeginning);                                    //These are the values that the user has given Eg:23:59:50
        newmins.setValue(minutesAtBeginning);                                   //The setValue method is used to set that as the initial value
        newsecs.setValue(secondsAtBeginning);

        this.hours = newhours;                                                  //And then this.hours/mins/secs is assigned with newhours/newmins/newsecs
        this.minutes = newmins;
        this.seconds = newsecs;

    }

    public void tick() {
        this.seconds.next();                                                    //First the seconds are incremented 

        if (this.seconds.getValue() == 0) {                                     //this.seconds is compared to 0 because if the value was 59, It would have got incremented to 0 , and then we increment mins

            this.minutes.next();                                                //If it was compared to 59 instead , we would get 59:58 --> 00:59. because 58 gets incremented to 59 and so the mins get incremented at 59th second itself
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }

    }

    public String toString() {
        // returns the string representation

        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}

// WAP to add and subtract two times (hours,minutes & seconds) using constructors
// with proper conditions of 24 hour format and display the result. 

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        validateTime();
    }

    private void validateTime() {
        if (hours >= 24) {
            hours = hours % 24;
        }
        if (minutes >= 60) {
            minutes = minutes % 60;
            hours += 1;
            validateTime();
        }
        if (seconds >= 60) {
            seconds = seconds % 60;
            minutes += 1;
            validateTime();
        }
    }

    public Time add(Time t) {
        int newHours = this.hours + t.hours;
        int newMinutes = this.minutes + t.minutes;
        int newSeconds = this.seconds + t.seconds;
        return new Time(newHours, newMinutes, newSeconds);
    }

    public Time subtract(Time t) {
        int newHours = this.hours - t.hours;
        int newMinutes = this.minutes - t.minutes;
        int newSeconds = this.seconds - t.seconds;
        if (newSeconds < 0) {
            newSeconds += 60;
            newMinutes -= 1;
        }
        if (newMinutes < 0) {
            newMinutes += 60;
            newHours -= 1;
        }
        if (newHours < 0) {
            newHours += 24;
        }
        return new Time(newHours, newMinutes, newSeconds);
    }

    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Time t1 = new Time(6, 15, 30);
        Time t2 = new Time(3, 25, 45);
        Time sum = t1.add(t2);
        Time difference = t1.subtract(t2);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();

        System.out.println("Sum:");
        sum.display();

        System.out.println("Difference:");
        difference.display();
    }
}

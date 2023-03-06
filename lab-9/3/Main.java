// Create a Date class with three integer instance variables named day,month,year. It has a constructor with three parameters for initializing the instance variables, and it has one method named daysSince Jan1(). It computes and returns the number of days since January 1 of the same year, including January 1 and the day in the

// Date object.

class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int daysSinceJan1() {
        int daysInMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int days = day;
        for (int i = 1; i < month; i++) {
            days += daysInMonth[i];
            if (i == 2 && isLeapYear(year)) {
                days++;
            }
        }
        return days;
    }
    
    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(1, 1, 2022);
        Date d2 = new Date(10, 2, 2022);
        
        int days1 = d1.daysSinceJan1();
        int days2 = d2.daysSinceJan1();
        
        int daysBetween = days2 - days1;
        System.out.println("Days between d1 and d2: " + daysBetween);
    }
}

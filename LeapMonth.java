package vu.leapmonth1;

public class LeapMonth {
    // Declare the necessary variables
    private int year;
    private int month;

    // Constructor to initialize the year and month
    public LeapMonth(int year, int month) {
        this.year = year;
        this.month = month;
    }

    // Method to check if the given month is a leap month
    public boolean isLeapMonth() {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
}

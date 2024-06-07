package vu.leapmonth1;

public class LeapMonth1{
    public static void main(String[] args) {
        // Example usage
        LeapMonth leapMonth = new LeapMonth(2024, 2);
        boolean isLeapMonth = leapMonth.isLeapMonth();
        System.out.println("Is the month a leap month? " + isLeapMonth);
    }
}

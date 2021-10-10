// Muhammad Khan
// Project 1
// CSCI 212 11

public class Date212 {
    private int year;
    private int month;
    private int day;

    Date212(String date) {
        int y = Integer.parseInt(date.substring(0, 3));
        int m = Integer.parseInt(date.substring(4, 5));
        int d = Integer.parseInt(date.substring(6, 7));

        year = y;
        month = m;
        day = d;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Date212 date = new Date212("19860112");
        date.getDay();
        date.getMonth();
        date.getYear();
        System.out.println(date);
    }
}

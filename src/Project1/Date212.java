package Project1;
// Muhammad Khan
// Project 1
// CSCI 212 11

public class Date212 {
    private int year;
    private int month;
    private int day;

    private final String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    Date212(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    Date212(String date) {
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(4, 6));
        day = Integer.parseInt(date.substring(6, 8));
    }

    // Accessors
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // Mutators
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        Date212 d = (Date212) o;
        return year == d.year && month == d.month && day == d.day;
    }

    @Override
    public String toString() {
        return months[month] + " " + day + ", " + year;
    }

    public int compareTo(Date212 o) {
        return (year + " " + month + " " + day).compareTo(o.year + " " + o.month + " " + o.day);
    }

    public static void main(String[] args) {
        Date212 date = new Date212("20160112");
        System.out.println(date);
    }
}

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

    public Date212(String date) {
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
    public boolean equals(Object m) {
        Date212 d = (Date212) m;
        return year == d.year && month == d.month && day == d.day;
    }

    @Override
    public String toString() {
        return months[month] + " " + day + ", " + year;
    }

    public int compareTo(Date212 m) {
        return (year + " " + month + " " + day).compareTo(m.year + " " + m.month + " " + m.day);
    }

//    For testing purpose
//    public static void main(String[] args) {
//        Date212 date = new Date212("20160112"); // Returns "January 12, 2016"
//        System.out.println(date);
//    }
}
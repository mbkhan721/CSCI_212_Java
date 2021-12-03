package Project3;

public class Date212 {

    private final String[] monthsInYear = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private String monthString;
    private int year;
    private int month;
    private int day;


    public Date212(int y, int m, int d) {
        year = y;
        monthString = monthsInYear[m];
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date212(String date) {
        this(Integer.parseInt(date.substring(0, 4)),
                Integer.parseInt(date.substring(4, 6)),
                Integer.parseInt(date.substring(6 , 8)));
//        this.year = Integer.parseInt(date.substring(0, 4));
//        this.month = Integer.parseInt(da.substring(4, 6));
//        this.day = Integer.parseInt(da.substring(6, 8));
    }

    public String getAsString() {
        return monthString + " " + String.format("%02d", day)
                + ", " + String.format("%04d", day);
    }

    public String toString() {
        String d = "";
        d += this.year;
        d += this.month < 10 ? "0" + this.month : this.month;
//        d += "/" + (this.day < 10 ? "0" + this.day : this.day);
//        d += "/" + this.year;
        d += this.day < 10 ? "0" + this.day : this.day;
        return d;
    }

    public int compareTo(Date212 d) {
        if (this.year < d.year) {
            return -1;
        } else if (this.year > d.year) {
            return 1;
        }
        if (this.month < d.month) {
            return -1;
        } else if (this.month > d.month) {
            return 1;
        }
        if (this.day < d.day) {
            return -1;
        } else if (this.day > d.day) {
            return 1;
        }
        return 0;
    }
}

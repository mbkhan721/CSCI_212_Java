package Project1;
// Muhammad Khan
// Project 1
// CSCI 212 11

public class Date212 implements Comparable<Date212> {
    private final int year;
    private final int month;
    private final int day;

    public Date212(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date212(String date) {
        this.year = Integer.parseInt(date.substring(0, 4));
        this.month = Integer.parseInt(date.substring(4, 6));
        this.day = Integer.parseInt(date.substring(6, 8));
    }

    /**
     * Override compareTo method
     * Comparision of date objects
     */
    public int compareTo(Date212 other) {
        if (this.year < other.year) {
            return -1;
        } else if (this.year > other.year) {
            return 1;
        }
        if (this.month < other.month) {
            return -1;
        } else if (this.month > other.month) {
            return 1;
        }
        if (this.day < other.day) {
            return -1;
        } else if (this.day > other.day) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns the string representation of the Date212 object
     */
    public String toString() {
        String result = "";
        result += this.month < 10 ? "0" + this.month : this.month;
        result += "/" + (this.day < 10 ? "0" + this.day : this.day);
        result += "/" + this.year;
        return result;
    }
}

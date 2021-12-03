package Project3;

public class Date212 {

    private int year;
    private int month;
    private int day;

    public Date212(String date) {
// checks if the date is valid
        if (isValidDate(date)) {
// takes the date and takes out the month, day, and year
            String str = date.substring(0, 4);
            String str1 = date.substring(4, 6);
            String str2 = date.substring(6, 8);
            month = Integer.parseInt(str1);
            day = Integer.parseInt(str2);
            year = Integer.parseInt(str);

        }
        setDate212(month, day, year);
    }

    /**
     * Checks if the month and day are legal, throws IllegalDate212Exception if a
     * month or day is invalid.
     *
     * @param month
     * @param day
     * @param year
     */
    public void setDate212(int m, int d, int y) {

        year = y;
        month = m;
        day = d;

        if (m >= 13) {
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) {
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 4 || m == 6 || m == 8 || m == 11) && d > 30) {
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 2) && d > 28) {
            throw new IllegalDate212Exception("Invalid date.");
        }

    }// setDate212

    /**
     * checks to see if the dates are 8 digits
     */
    public static boolean isValidDate(String s) {
        if (s.length() != 8) {
            return false;
        } // if
        for (int i = 0; i < 8; i++)
            if (!Character.isDigit(s.charAt(i))) {
                throw new IllegalDate212Exception("Invalid date: " + s);
            } // if
        return (true);
    }// isValidDate

    /**
     * Compares two dates with each other
     *
     * @param other date
     * @return the comparison value
     */
    public int compareTo(Date212 other) {
// TODO Auto-generated method stub

        return (year * 10000 + month * 100 + day) - (other.year * 10000 + other.month * 100 + other.day);
    }

    /**
     * This method returns the format for the dates.
     */
    public String toString() {

        return +month + "/" + day + "/" + year;
    }
}
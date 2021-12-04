package Project3;

public class Date212 {

    private int year;
    private int month;
    private int day;

    public Date212(String date) {
        if (DateVerified(date)) {
            String yr = date.substring(0, 4);
            String mo = date.substring(4, 6);
            String dy = date.substring(6, 8);

            month = Integer.parseInt(mo);
            day = Integer.parseInt(dy);
            year = Integer.parseInt(yr);
        }
        setDate212(month, day, year);
    }

    public void setDate212(int m, int d, int y) {

        year = y;
        month = m;
        day = d;

        if (m >= 13) { // If month is over 12
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                && d > 31) { // Checking precise days of the months
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 4 || m == 6 || m == 8 || m == 11)
                && d > 30) { // Checking precise days of the months
            throw new IllegalDate212Exception("Invalid month." + y + m + d);
        }
        if ((m == 2) && d > 28) { // Specializing condition for February
            throw new IllegalDate212Exception("Invalid date.");
        }

    } // setDate212

    public static boolean DateVerified(String d) {
        if (d.length() != 8) { // Checking to see of the date length is 8 digits
            return false;      // (required length)
        } // if
        for (int i = 0; i < 8; i++)
            if (!Character.isDigit(d.charAt(i))) {
                throw new IllegalDate212Exception("Invalid date: " + d);
            } // if
        return (true);
    }// DateVerified

    public int compareTo(Date212 other) { // Comparing both dates with each other.

        return (year * 10000 + month * 100 + day) -
                (other.year * 10000 + other.month * 100 + other.day);
    }

    public String toString() {
        return +month + "/" + day + "/" + year;
    } // toString prints the date in String format
}
package Project3;

public class Date212 implements Comparable <Date212> {

    private int year;
    private int day;
    private int month;

    public Date212(String date) {
        if (DateVerified(date)) {
            String yr = date.substring(0, 4);
            month = Integer.parseInt(date.substring(4, 6));
            String dy = date.substring(6, 8);

            day = Integer.parseInt(dy);
            year = Integer.parseInt(yr);
        }
        setDate212(month, day, year);
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(String d) {
        month = Integer.parseInt(d.substring(4, 5));
    }

    public void setDay(String d) {
        day = Integer.parseInt(d.substring(6));
    }

    public void setYear(String d) {
        year = Integer.parseInt(d.substring(0, 3));
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
        // result = 1 if is greater, result = -1 if is smaller, result =0 if is equal
        int result = 0;
        if (this.year > other.year) {
            result = 1;
            return result;
        }
        if (this.year < other.year) {
            result = -1;
            return result;
        }
        if (this.month > other.month) {
            result = 1;
            return result;
        }
        if (this.month < other.month) {
            result = -1;
            return result;
        }
        if (this.day > other.day) {
            result = 1;
            return result;
        }
        if (this.day < other.day) {
            result = -1;
            return result;
        }
        return result;
    }

    public String toString() {
        String[] monArray = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String result = getDayName(day, month, year);
        result = result + ", " + monArray[getMonth()] + " " + getDay() + "," + getYear();
        return result;
    } // toString prints the date in String format


     // Using Zeller's Congruence to find the day
    public String getDayName(int day, int month, int year) {
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = day + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        return switch (h) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> ("Monday");
            case 3 -> ("Tuesday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thursday");
            case 6 -> ("Friday");
            default -> "";
        };
    }
}
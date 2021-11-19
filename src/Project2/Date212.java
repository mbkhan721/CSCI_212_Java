package Project2;

public class Date212 {
    private int year;
    private int month;
    private int day;

    // Constructor with three parameters
    public Date212(int y, int mo, int d) {
        this.year = y;
        this.month = mo;
        this.day = d;
    }

    public Date212(String da) {
        this.year = Integer.parseInt(da.substring(0, 4));
        this.month = Integer.parseInt(da.substring(4, 6));
        this.day = Integer.parseInt(da.substring(6, 8));
    }

    public int compareTo(Date212 dat) {
        if (this.year < dat.year) {
            return -1;
        } else if (this.year > dat.year) {
            return 1;
        }
        if (this.month < dat.month) {
            return -1;
        } else if (this.month > dat.month) {
            return 1;
        }
        if (this.day < dat.day) {
            return -1;
        } else if (this.day > dat.day) {
            return 1;
        }
        return 0;
    }
    public String toString() {
        String res = "";
        res += this.month < 10 ? "0" + this.month : this.month;
        res += "/" + (this.day < 10 ? "0" + this.day : this.day);
        res += "/" + this.year;
        return res;
    }
}

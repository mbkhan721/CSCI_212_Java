package Project2;

public class Date212 {
    private final int year;
    private final int month;
    private final int day;

    public Date212(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public Date212(String da) {
        this.year = Integer.parseInt(da.substring(0, 4));
        this.month = Integer.parseInt(da.substring(4, 6));
        this.day = Integer.parseInt(da.substring(6, 8));
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
    public String toString() {
        String d = "";
        d += this.month < 10 ? "0" + this.month : this.month;
        d += "/" + (this.day < 10 ? "0" + this.day : this.day);
        d += "/" + this.year;
        return d;
    }
}

package Project3;

public abstract class Date212List {
    protected Date212Node first;
    protected Date212Node last;
    protected Date212Node d;
    protected int length;

    public abstract void add(Date212 date);

    public String toString() {
        String res = "";
        d = first.next;
        while (d != null) {
            res += d.date.toString() + "\n";
            d = d.next;
        }
        return res;
    }

    public String printString() {
        String result = " ";
        d = first.next;
        while (d != null) {
            result = result + d.date.getAsString() + "\n";
            d = d.next;
        }
        return result;
    }
}

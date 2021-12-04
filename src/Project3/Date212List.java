package Project3;

public abstract class Date212List {
    protected Date212Node first;
    protected Date212Node last;
    protected int length;

    public Date212List() {
        Date212Node d = new Date212Node();
        first = d;
        last = d;
        length = 0;
    } // constructor

    public String toString() {
        Date212Node d = first.next;
        String temp = " ";

        while (d != null) {
            temp += d.data + "\n";
            d = d.next;
        }
        return temp;
    }
}

package Project3;

public class Date212Node {

    Date212 data;
    Date212Node next;

    public Date212Node(Date212 data, Date212Node next) {
        this.data = data;
        this.next = next;
    } // constructor

    public Date212Node() {
        this.data = null;
        this.next = null;
    } // constructor

    public Date212Node(Date212 data) {
        this.data = data;
        this.next = null;
    } // constructor

}
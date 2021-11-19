package Project2;

public class Date212Node {
    Date212 data;
    Date212Node next;

    Date212Node(Date212 dt) {
        this.data = dt;
        this.next = null;
    }


    Date212Node() {
        this.data = null;
        this.next = null;
    }



    public String toString() {
        return this.data.toString();
    }
}
package Project3;

public abstract class Date212List {
    private Date212Node head;
    private Date212Node last;
    int length;

    public Date212List() {
        head = last = new Date212Node();
        length = 0;
    }

    public void append(Date212Node d) {
        last.next = d;
        last = last.next;
        length++;
    }

    public void appendS(Date212Node d) {
        Date212Node myNode = this.head;
        while (myNode.next != null && myNode.next.data.compareTo(d.data) < 0) {
            myNode = myNode.next;
        }
        d.next = myNode.next;
        myNode.next = d;
        this.length++;
    }

    public String toString() {
        String res = "";
        Date212Node current = this.head.next;
        while (current != null) {
            res += current.data.toString() + "\n";
            current = current.next;
        }
        return res;
    }
}

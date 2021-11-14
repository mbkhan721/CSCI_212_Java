package Project2;

public abstract class Date212List {

    public Date212Node head;
    public Date212Node last;
    private int length;

    public Date212List() {
        head = null;
        last = null;
        length = 0;
    }

    public void append(Date212 d) {
        Date212Node newNode = new Date212Node(d);
        last.next = newNode;                        // null end becomes the new node
        last = last.next;                           // last moves over to the right
        length++;                                   // length increments by 1
    }

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;                         // If length is 0, return
    }

}

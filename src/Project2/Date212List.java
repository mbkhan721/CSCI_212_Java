package Project2;

public class Date212List {

    private Date212Node head = new Date212Node(null);
    private Date212Node last = head;
    private int length = 0;

    public void append(Date212 d) {
        Date212Node newNode = new Date212Node(d);
        last.next = newNode;                        // null end becomes the new node
        last = last.next;                           // last moves over to the right
        length++;                                   // length increments by 1
    }

}

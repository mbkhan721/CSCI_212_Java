package Project2;

public class SortedDate212List extends Date212List{

    public SortedDate212List() {
        super();
    }  // constructor

    public void add(Date212 d) {
        Date212Node date = new Date212Node(d);
        Date212Node prev = head;
        Date212Node current = head.next;

        while (current != null && d.compareTo(current.data) > 0) {
            prev = current;
            current = current.next;
        }
        prev.next = date;
        date.next = current;
        length++;

        if (date.next == null) {
            last = date;
        }
    }
}

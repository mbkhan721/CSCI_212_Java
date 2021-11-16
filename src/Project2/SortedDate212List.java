package Project2;

public abstract class SortedDate212List extends Date212List{

//    public Date212 data;
//    public Date212 next;

    public SortedDate212List() {
        super();
    }  // constructor

    public void add(Date212 d) {
        Date212Node date = new Date212Node(d);
        Date212Node prev = head;
        Date212Node current = head.next;

        while (current != null && d.toString().compareTo(current.data.toString()) > 0) {
            prev = current;
            current = current.next;
        }

        if (date.next == null) {
            last = date;
            length++;
        }


    }
}

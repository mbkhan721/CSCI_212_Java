package Project3;

public class SortedDate212List extends Date212List {
    public SortedDate212List(){
        super();
    }

    public void add(Date212 d) {

        Date212Node n = new Date212Node(d);
        Date212Node temp = first.next;
        if (temp == null || d.compareTo(last.data) > 0) { // append
            last.next = n;
            last = n;
            length++;
        }
        else if (d.compareTo(temp.data) < 0) { // prepend
            n.next = temp;
            first.next = n;
        }
        else { // insert
            while (temp.next != null && (d.compareTo(temp.next.data)) > 0) {
                temp = temp.next;
            } // while
            n.next = temp.next;
            temp.next = n;
        }
    }
}

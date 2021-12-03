package Project3;

public class SortedDate212List extends Date212List {

    public SortedDate212List() {
        Date212Node j = new Date212Node(null);
        first = j;
        last = j;
        length = 0;
    }

    public void add(Date212 date212) {
        Date212Node newNode = new Date212Node(date212);
        if (first.next == null) {
            last.next = newNode;
            last = newNode;
            length++;
        }
        d = first;
        while (d.next != null && d.next.date.compareTo(date212) < 0)
            d = d.next;
        if (d.next == null) {
            last.next = newNode;
            last = newNode;
        }
        else {
            newNode.next = d.next;
            d.next = newNode;
        }
        d = first;
        length++;
    }
}

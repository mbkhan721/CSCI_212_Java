package Project3;

public class SortedDate212List extends Date212List {

    /**
     * Sorts the dates and prepares to be placed in the array in sorted order
     *
     * @param Date212
     * dt
     */
    public void add(Date212 dt) {

        Date212Node n = new Date212Node(dt);
        Date212Node temp = first.next;
// Date is inserted right after the last node of the list
        if (temp == null || dt.compareTo(last.data) > 0) {
            last.next = n;
            last = n;
            length++;
        } // if
// Date is inserted right before the first node of the list (after the dummy
// node)
        else if (dt.compareTo(temp.data) < 0) {
            n.next = temp;
            first.next = n;

        } // else if
        else {
// Date is inserted in the middle of the list
            while (temp.next != null && (dt.compareTo(temp.next.data)) > 0) {
                temp = temp.next;
            } // while
            n.next = temp.next;
            temp.next = n;
        } // else

    }// add

}// SortedDateList

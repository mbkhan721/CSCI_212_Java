package Project3;

public class UnsortedDate212List extends Date212List {

    /**
     * Adds the date to the linked list
     * @param Date212 s
     */
    public void add(Date212 s) {

        Date212Node n = new Date212Node(s);
        last.next = n;
        last = n;
        length++;
    }//add

}//UnsortedDateList
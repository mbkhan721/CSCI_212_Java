package Project3;

public class UnsortedDate212List extends Date212List {

    public void add(Date212 d) {

        Date212Node n = new Date212Node(d);
        last.next = n;
        last = n;
        length++;
    }
}

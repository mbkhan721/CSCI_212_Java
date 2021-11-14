package Project2;

public class SortedDate212List extends Date212List{

    public Date212 data;
    public Date212 next;

    public SortedDate212List() {
        super();
    }  // constructor

    public void add(Date212 date, int index) {
        if(isEmpty()) {
            add(date, 0);
            return;
        }

        int place = 0;
        Date212Node tmpNode = head;
        while(tmpNode != null) {
                add(date, place);
            tmpNode = tmpNode.next;
            place++;
        }
        add(date, getSize());
    }
}

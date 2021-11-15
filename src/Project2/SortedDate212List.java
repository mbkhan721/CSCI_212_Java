package Project2;

public class SortedDate212List extends Date212List{

//    public Date212 data;
//    public Date212 next;

    public SortedDate212List() {
        super();
    }  // constructor

    public void add(Date212 date, int index) {
        if(isEmpty()) {
            add(date, 0);
            return;
        }

        int myNum = 0;
        Date212Node temp = head;
        while(temp != null) {
                add(date, myNum);
            temp = temp.next;
            myNum++;
        }
        add(date, getSize());
    }
}

package Project3;

public class SortedDate212List extends Date212List {

    public SortedDate212List()
    {
        super();
    }
    public int getLength() {
        return length;
    }

    public void add(Date212 d) {
        Date212Node a = new Date212Node(d);
        this.appendS(a);
    }

    public String toString() {
        return super.toString();
    }
}

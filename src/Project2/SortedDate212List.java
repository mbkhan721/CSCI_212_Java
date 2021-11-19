package Project2;

public class SortedDate212List extends Date212List {
    public SortedDate212List()
    {
        super();
    }
    public int getLength() {
        return length;
    }

    public void add(Date212 dt) {
        Date212Node te = new Date212Node(dt);
        this.append_sorted(te);


    }

    public String toString() {
        return super.toString();
    }
}

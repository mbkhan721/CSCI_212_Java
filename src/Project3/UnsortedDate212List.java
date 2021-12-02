package Project3;

public class UnsortedDate212List extends Date212List {

    public UnsortedDate212List()
    {
        super();
    }
    public int getLength() {
        return length;
    }

    public void add(Date212 dt) {
        Date212Node d = new Date212Node(dt);
        this.append(d);
    }

    public String toString() {
        return super.toString();
    }
}

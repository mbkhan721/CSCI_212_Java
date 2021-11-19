package Project2;

public class UnsortedDate212List extends Date212List{

    public UnsortedDate212List()
    {
        super();
    }
    public int getLength() {
        return length;
    }

    public void add(Date212 dt) {
        Date212Node te = new Date212Node(dt);
        this.append(te);

    } // method append(Date212)

    public String toString() {
        return super.toString();
    }
}

package Project2;

public abstract class Date212List {
    private Date212Node first;
    private Date212Node last;
    int length;
    public Date212List()
    {
        first = last = new Date212Node();
        length = 0;
    }
    public void append(Date212Node dt)
    {
        last.next = dt;
        last = last.next;
        length++;
    }
    public void append_sorted(Date212Node dt)
    {
        Date212Node nodepre = this.first;
        while (nodepre.next != null && nodepre.next.data.compareTo(dt.data) < 0) {
            nodepre = nodepre.next;
        }
        dt.next = nodepre.next;
        nodepre.next = dt;
        this.length++;
    }
    public String toString() {
        String res = "";
        Date212Node nodecurr = this.first.next;
        while (nodecurr != null) {
            res += nodecurr.data.toString() + "\n";
            nodecurr = nodecurr.next;
        }
        return res;
    }
}

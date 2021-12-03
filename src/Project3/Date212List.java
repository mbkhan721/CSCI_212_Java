package Project3;

public abstract class Date212List {
    protected Date212Node first;
    protected Date212Node last;
    protected int length;

    public Date212List() {

        Date212Node dn = new Date212Node();
        first = dn;
        last = dn;
        length = 0;
    } // constructor

    public String toString() {

        Date212Node p = first.next;
        String returnString = " ";
        while (p != null) {
            returnString += p.data + "\n";
            p = p.next;
        } // while
        return returnString;

    }// toString

}// class DateList

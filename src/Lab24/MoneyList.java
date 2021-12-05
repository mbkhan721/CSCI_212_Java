package Lab24;

public class MoneyList { // dummy->1->2->3->4->null;

    Node dummy;

    public MoneyList(Money m) {
        dummy = new Node(m);
    }

    public void add(Money m) { // add to the end
        Node spot = dummy;
        while (spot.next != null) {
            spot = spot.next;
        }
        spot.next = new Node(m);
    }
}

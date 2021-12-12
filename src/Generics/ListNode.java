package Generics;

public class ListNode <E> {

    E data;
    ListNode next;

    public ListNode(E myData) {
        data = myData;
        next = null;
    }

    public ListNode() {
        data = null;
        next = null;
    }
}

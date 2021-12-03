package Project3;

import java.awt.*;

public class UnsortedDate212List extends Date212List {

    public UnsortedDate212List() {
        Date212Node ln = new Date212Node(null);
        first = ln;
        last = ln;
        length = 0;
    }

    public void add(Date212 date) {
        Date212Node newNode = new Date212Node(date);
        last.next = newNode;
        last = newNode;
        length++;
    }
}
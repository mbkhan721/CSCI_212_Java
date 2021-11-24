package PracticeExam02;

public class Question01 {
    int data;
    Question01 next;
}


/*
1. Define a list node
It's a dynamic data structure that links the item in a list to another. A linked list is composed of
objects known as nodes. Each  node allocates memory to hold data and a next to hold link to another node.
The links are implemented as references to the node. In a linkedList, each node only contains one link.

2. Define a singly-linked list with head node and counter
It's a data structure in which each element of the list contains a pointer. The first node of the list is
called as head. Counter count the number of occurrences in the node. You first initialize counter to 0,
loop through each element of the list, if element data is equal to the passed number then increment the
counter.

3. Be able to traverse the list from beginning to end and, for example, find a given node, print the data
in a given node.
*/
class LinkedList {
    Question01 head;
    public int givenNode(int index) {
        Question01 current = head; // head of the list
        int count = 0; // index of node we are currently looking at.
        while (current != null) {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
        assert (false); // if we get to this line, the caller was askin for a non-existent element so
                        // we assert fail
        return 0;
    }

    /*
    3B. Traversing a linked list:

    public class Node1 {

    private String item;
    private int count;
    private Node1 link;

    public Node1() {
    link = null;
    item = null;
    count = 0;
    }
    }

    public String getItem() { return item; }
    public int getCount() { return count; }
    public Node1 getLink() { return link; }

    Node1 position = head;
    while (position != null) {
        System.out.println(position.getItem() + " " + position.getCount());
        position = position.getLink();
    }
     */


    // 4. Append a new node to the end of the list.
    private Question01 last;
    private int length;
    public void append() {

        Question01 newNode = new Question01();
        last.next = newNode;
        last = last.next;
        length++;
    }
}


// 5. Insert a new node after a given node in the list





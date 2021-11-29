package PracticeExam02.LinkedList;

public class LL1 {

    private Node1 head;

    public LL1() {
        head = null;
    }

    /**
     * Adds a node at the start of the list with the specified data.
     * The added node will be the first node in the list.
     */
    public void addToStart(String itemName, int itemCount) {
        head = new Node1(itemName, itemCount, head);    // new node becomes the first node in the list
    }

    /**
     * Removes the head node and returns empty if the list contains at least one
     * node. Returns false if the list is empty.
     */
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.getLink();  // head points to the old second node in LL
            return true;
        }
        else
            return false;
    }

    /**
     * Returns the number of nodes in the list.
     */
    public int size() {
        int count = 0;
        Node1 position = head;

        while (position != null) { // this last node is indicated by the link field being equal to null.
            count++;
            position = position.getLink();
        }
        return count;
    }

    public boolean contains(String item) {
        return (find(item) != null);
    }

    /**
     * Finds the first node containing the target item, and returns a reference to that
     * node. If the target is in the list, null is returned.
     */
    private Node1 find(String target) {
        Node1 position = head;
        String itemAtPosition;

        while (position != null) {                  // traversing an entire linked list.
            itemAtPosition = position.getItem();
            if (itemAtPosition.equals(target))
                return position;
            position = position.getLink();
        }
        return null; // target was not found
    }

    public void outputList() {
        Node1 position = head;  // position is the name for the node

        while (position != null) {
            System.out.println(position.getItem() + " " + position.getCount());
            position = position.getLink();  // position.link is a name for the link to
                                            // the next node. The value of link is produced
                                            // with accessor method getLink().
        }
    }


}

























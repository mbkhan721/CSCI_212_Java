package PracticeExam02;

public class StringNode {

    String data;
    StringNode next;

    public StringNode() {
        data=null;
        next=null;
    }

    public StringNode(String value){
        data=value;
        next=null;
    }

    // A
    public class StringList {
        StringNode first;
        StringNode last;
        int length;

        public StringList() {
            first = null;
            last = null;
            length = 0;
        }

        public int printStrings (int count) {
            StringNode position = first;  // position is the name for the node
            count = 0;

            while (position != null) {
                //System.out.println(position.next + " " + position.getCount());
                position = position.next;  // position.link is a name for the link to
                                                // the next node. The value of link is produced
                                                // with accessor method getLink().
                count++;
            }
            return count;
        }
    }




}



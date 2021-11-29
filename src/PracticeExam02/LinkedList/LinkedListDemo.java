package PracticeExam02.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LL1 list = new LL1();
        list.addToStart("Apples", 1);
        list.addToStart("Bananas", 2);
        list.addToStart("Cantaloupe", 3); // Cantaloupe is not headNode

        System.out.println("\nList has " + list.size() + " nodes.");
        list.outputList();

        if (list.contains("Cantaloupe"))
            System.out.println("\nCantaloupe is on the list.");
        else
            System.out.println("Cantaloupe is not on list.");

        list.deleteHeadNode();
        if (list.contains("Cantaloupe"))
            System.out.println("Cantaloupe is on the list.");
        else
            System.out.println("Cantaloupe is not on list.\n");

        while (list.deleteHeadNode())
            ; // empty body
        System.out.println("Start of list:");
        list.outputList();
        System.out.println("End of list.");
    }
}

// left at pg 819
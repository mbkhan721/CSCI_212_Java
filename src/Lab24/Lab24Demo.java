package Lab24;

public class Lab24Demo {

    public static void main(String[] args) {

        Money m = new Bill(-1);
        MoneyList list = new MoneyList(m);

        list.add(new Bill(1));
        list.add(new Bill(5));
        list.add(new Bill(10));
        list.add(new Bill(20));
        list.add(new Bill(50));
        list.add(new Bill(100));

        list.add(new Quarter());
        list.add(new Quarter());
        list.add(new Quarter());

        //the list should looks like: [1 5 10 20 50 100 25 25 25]

        printFromFirstToLast(list.dummy.next);
        System.out.println();
        printFromLastToFirst(list.dummy.next);
        System.out.println("\n");
        System.out.println("Total Money is "+sumMoney(list.dummy.next));
        System.out.println("Total Quarter is "+sumQuarter(list.dummy.next));
    }

    public static void printFromFirstToLast(Node head) { // 1 2 3 4
        // base case
        if (head == null)
            return;

        Money m = head.money;
        if (m instanceof Bill) // check if m belong to Bill
            System.out.print(((Bill)m).getValue() + " "); // Bill class casting
        if (m instanceof Coin) // Check if m belongs to Coin
            System.out.print(((Coin)m).getValue() + " "); // Coin class casting
        printFromFirstToLast(head.next);
    }

    public static void printFromLastToFirst(Node node) { // 4 3 2 1
        // base case
        if (node == null)
            return;

        printFromLastToFirst(node.next);

        Money m = node.money;
        if (m instanceof Bill) // check if m belong to Bill
            System.out.print(((Bill)m).getValue() + " "); // Bill class casting
        if (m instanceof Coin) // Check if m belongs to Coin
            System.out.print(((Coin)m).getValue() + " "); // Coin class casting
    }

    public static double sumMoney(Node node) { // 1 2 3 4
        // base case
        if (node == null)
            return 0;

        Money m = node.money;
        double currentValue = 0;

        if (m instanceof Bill) //check if m belong to Bill
            currentValue += ((Bill)m).getValue(); // Bill class casting.
        if (m instanceof Coin) //check if m belong to coin
            currentValue += ((Coin)m).getValue() / 100.0; // coin class casting

        return currentValue + sumMoney(node.next);
    }

    public static double sumQuarter(Node node) {
        // base case
        if (node == null)
            return 0.0;

        Money m = node.money;
        double currentValue = 0;

        if (m instanceof Coin) //check if m belong to coin
            currentValue += ((Coin)m).getValue() / 100.0; // Coin class casting

        return currentValue + sumQuarter(node.next);
    }
}













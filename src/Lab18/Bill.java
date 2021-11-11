package Lab18;

public class Bill extends Money {
    private int dollars;

    public Bill(int d) { // d belong to {1, 5, 10, 20, 50, 100}

        try {
            if (d == 1 || d == 5 || d == 10 || d == 20 || d == 50 || d == 100)
                dollars = d;
            else
                throw new IllegalBillException("Invalid input from Bill Class");
        }
        catch (IllegalBillException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getValue () {
        return dollars;
    }

    public String toString() {return "$" + dollars + ".00";
    }
}
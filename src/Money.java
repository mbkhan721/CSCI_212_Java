// Muhammad Khan
// Lab 14

import java.util.Objects;

public class Money {

    int dollars, cents;

    public Money() {
        dollars = 0;
        cents = 0;
    }

    public Money(int d, int c) {
        dollars = d;
        cents = c;
    }

    public int getDollars() {
        return dollars;
    }
    public int getCents() {
        return cents;
    }

    @Override
    public String toString() {
        //return "$ " + dollars + "." + cents;
        String output = "$" + dollars;
        if (cents < 10)
            output += ".0" + cents;
        else
            output += "." + cents;

        return output;
    }

    public int compareTo(Money m) {
        return ("$ " + dollars + "." + cents).compareTo("$ " + m.dollars + "." + m.cents);
    }

    @Override
    public boolean equals(Object o) {
        //Money money = (Money) o;
        //return dollars == money.dollars && cents == money.cents;
        return o == this;
    }

    public void add(Money m) {
        this.dollars += m.cents / 100 + m.dollars;
        this.cents += m.cents % 100;
    }

    public static void main(String []args) {
        Money m1 = new Money();
        Money m2 = new Money(6,5);
        System.out.println(m1.getCents());
        System.out.println(m2.getDollars());
        System.out.println(m2);
        System.out.println(m1.compareTo(m2)); // Returns -6 coz m1(0) is 6 less than m2(6)
        System.out.println(m1.equals(m2));    // Returns false coz m1 = 0 and m2 = $6.05

        // Lab 15
        System.out.println("\nLab15:");
        Money m = new Money(5,243);
        System.out.println(m.toString());

        Money m3, m4;
        m3 = new Money(4,87);
        m4 = new Money(5,243);
        m3.add(m4);
        System.out.println(m1.toString());
    }
}

// Muhammad Khan
// Lab 14

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
        return "$ " + dollars + "." + cents;
    }

    public int compareTo(Money m) {
        return ("$ " + dollars + "." + cents).compareTo("$ " + m.dollars + "." + m.cents);
    }

    public static void main(String []args) {
        Money m1 = new Money();
        Money m2 = new Money(6,5);
        System.out.println(m1.getCents());
        System.out.println(m2.getDollars());
        System.out.println(m2);
        System.out.println(m1.compareTo(m2));
        System.out.println(m1.equals(m2));
    }
}

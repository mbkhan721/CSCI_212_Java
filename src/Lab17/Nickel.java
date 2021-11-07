package Lab17;

public class Nickel extends Coin{

    public Nickel() {
        super(5);
    }

    public String toString() {
        return ("$ 0.0" + getValue());
    }

}

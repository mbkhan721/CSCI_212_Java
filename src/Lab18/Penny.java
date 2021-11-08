package Lab18;

public class Penny extends Coin {

    public Penny() {
        super(1);
    }

    public String toString(){
        return "$ 0.0" + getValue();
    }

}

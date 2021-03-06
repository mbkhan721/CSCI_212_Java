package Lab18;

import java.text.DecimalFormat;

public class Wallet {

    private MoneyList walletContents;
    private double total;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //init the var of a class inside the constructor
    public Wallet() {
        walletContents = new MoneyList();
    }

    public void addToWallet(Money m) {
        walletContents.append(m);
        if(m instanceof Bill) {
            total += ((Bill) m).getValue();
        } else {
            total += ((double) ((Coin) m).getValue()) / 100;
        }
    }
    public void print () {
        System.out.println(walletContents.toString());
    }

    public String getValue() {
        return df.format(total);
        // "dddd.cc" format
    }
}
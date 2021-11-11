package Lab18;

public class BadWalletMain {

    static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
    static Wallet myWallet = new Wallet();

    public static void main (String[] args) {
        // try / catch begins here
        for (int i=0;i<dataSource.length;i++){
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {

                String value = dataSource[i].substring(1, dataSource[i].length()); // AD
                for (int j = 0; j < value.length(); j++) {
                    char c = value.charAt(j);

                    try {
                        if (!Character.isDigit(c)) // digit [0-9]
                            throw new IllegalBillException("Invalid input from main function.");


                    }
                    catch (IllegalBillException e) {
                        System.out.println(e.getMessage());
                        System.exit(0);
                    }
                }


                int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
                //System.out.println(i + " " + billValue);
                myWallet.addToWallet(new Bill(billValue));
            }
            else
            if (dataItem == 'Q')
                myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
                myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
                myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
                myWallet.addToWallet(new Penny());
        }

        myWallet.print();
        System.out.println("My wallet contains: $"+myWallet.getValue());
    }

}
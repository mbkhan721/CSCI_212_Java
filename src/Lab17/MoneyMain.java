package Lab17;

public class MoneyMain {

    static String[] dataSource =  {"B5","Q","B20","Q","P1","N","D","P","D","D"};
    static Money[] wallet = new Money[dataSource.length];

    public static void main (String[] args) {

        for (int i = 0; i < dataSource.length; i++){
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {
                int billValue = Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
                wallet[i]= new Bill(billValue);
            }
            else
            if (dataItem == 'Q')
                wallet[i] = new Quarter();
            else if (dataItem == 'P')
                wallet[i] = new Penny();
            else if (dataItem == 'N')
                wallet[i] = new Nickel();
            else if (dataItem == 'D')
                wallet[i] = new Dime();
        }
        printWallet();
    }
    public static void printWallet () {
        for (int i = 0; i < wallet.length; i++) {
            if (wallet[i] instanceof Bill) // curr obj belong to Bill obj
                //System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
                System.out.println(wallet[i] + ".00");
            else
                System.out.println(wallet[i]);

        }
    }
    public static void sumWallet() {

    }
}
package Lab17;

public class MoneyMain {

    static String[] dataSource =  {"B5","Q","B20","Q"};
    static Money[] wallet = new Money[dataSource.length];

    public static void main (String[] args) {

        for (int i=0;i<dataSource.length;i++){
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {
                int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
                wallet[i]= new Bill(billValue);
            }
            else
            if (dataItem == 'Q')
                wallet[i]=new Quarter();
        }
        printWallet();
    }
    public static void printWallet () {
        for (int i=0;i<wallet.length;i++) {
            if (wallet[i] instanceof Bill)
                System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
            else
                System.out.println(wallet[i]);

        }
    }
}
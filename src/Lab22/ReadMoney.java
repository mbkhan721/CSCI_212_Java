package Lab22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadMoney {
    public static void main(String argv[]) throws Exception {
        FileInputStream fis = new FileInputStream("date.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Date date = (Date) ois.readObject();
        System.out.println("The date is: "+ date);
        ois.close();
        fis.close();
    }
}

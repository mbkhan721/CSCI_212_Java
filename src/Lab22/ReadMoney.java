package Lab22;

import java.io.*;


public class ReadMoney {

    public static void main(String argv[]) throws Exception {

        FileInputStream fis = new FileInputStream("money.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (fis.available() != 0) {
            Object o = ois.readObject();

            if (o instanceof Quarter)
                System.out.println(o);

            else if (o instanceof  Penny)
                System.out.println(o);

            else if (o instanceof  Nickel)
                System.out.println(o);
        }

        ois.close();
        fis.close();
    }
}

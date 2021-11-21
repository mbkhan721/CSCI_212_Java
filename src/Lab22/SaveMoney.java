package Lab22;

import java.io.*;

public class SaveMoney {

    public static void main(String argv[]) throws Exception {

        FileOutputStream fos = new FileOutputStream("money.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 0; i < 1; i++) {
            Quarter quart = new Quarter(); // Have SaveMoney create a Quarter
            oos.writeObject(quart);        // and write it to a file.

            Penny pen = new Penny();
            oos.writeObject(pen);

            Nickel nic = new Nickel();
            oos.writeObject(nic);
        }

        oos.flush();
        oos.close();
        fos.close();
    }
}

import java.io.*;

public class Lab06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();

        //int sum = sum (array, array.length);
        //int average = average(array, array.length);
    }


}

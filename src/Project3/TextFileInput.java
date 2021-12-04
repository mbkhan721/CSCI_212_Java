package Project3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileInput {

    private final String filename;
    private BufferedReader br;
    private int count = 0;

    public TextFileInput(String filename) { // constructor
        this.filename = filename;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readLine() {
        return readLineOriginal();
    }

    public int getLineCount() {
        return count;
    }


    protected final String readLineOriginal() {
        try {
            if (br == null)
                throw new RuntimeException(filename + " Cannot be read.");
            String line = br.readLine();
            if (line != null)
                count++;
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

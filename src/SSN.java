import javax.swing.*;

public class SSN {

    static String ssn;
    static String[] ssnList;
    static int ssnSize;

    public static void main(String[] args) {

        ssn = readSSN();
        storeSSN(ssn, ssnList, ssnSize);
        printSSNList(ssnList, ssnSize);
    }
    public static String readSSN() {
        String ssn;
        ssn = (JOptionPane.showInputDialog(null, "Enter SSN: "));
        if (isValidSSN(ssn))
            return ssn;
        else
            return null;
    }

    public static void storeSSN(String s, String[] list, int size) {
        if (!isValidSSN(s) && isValidList(list))
        list[ssnSize++] = s;
    }

    initialize();
        do {
        ssn = readSSN();
        storeSSN(ssn, ssnList);
        printSSNList(ssnList, ssnSize);
    }
        while (!ssn.equals("000000000"));

    public static void printSSNList(String[] list, int size) {
        if (!isValidList(list)) {
            System.out.println("\nCan't print from invalid list.");
            System.exit(0);
        }
        for (int i = 0; i < size; i++)
            if (!isValidSSN(list[i]))
                System.out.println("Invalid SSN: " + list[i]);
            else
                System.out.println(list[i]);
    }

    public static boolean isValidSSN(String s) {
        if (s.length() != 9) {
            System.out.println("\nAn SSN length must be 9.");
            return false;
        }
        for (int i = 0; i < 9; i++) {
            if (! Character.isDigit(s.charAt(i))) {
                System.out.println("\nSSN must have only digits.");
                return false;
            }
        }
        return true;
    }

    public static boolean isValidList(String[] list) {
        if (list == null) {
            System.out.println("\nArray is null.");
            System.exit(0);
        }
        if (ssnSize == list.length) {
            System.out.println("\nCan't store anymore SSNs");
            System.exit(0);
        }
        return true;
    }
}
// left at slide 21
public class SSN {
    private String SSNumber;

    public static void main(String[] args) {

    }

    public SSN (String s) {
        if (isValidSSN(s) )
            SSNumber = s;
        else
            throw new IllegalArgumentException(invalidReason(s));
    }

    public String toString() {
        return SSNumber;
    }

    public int compareTo(SSN other) {
        return SSNumber.compareTo(other.toString());
    }

    private static boolean isValidSSN(String s) {
        if (s.length() != 9)
            return (false);

        for (int i=0;i<9;i++)
            if (! Character.isDigit(s.charAt(i)))
                return(false);

        return (true);
    } // isValidSSN
    public boolean isValidSSN() {
        if (SSNumber.length() != 9)
            return (false);

        for (int i=0;i<9;i++)
            if (! Character.isDigit(SSNumber.charAt(i)))
                return(false);

        return (true);
    } // isValidSSN

    private static String invalidReason(String s) {
        for (int i=0;i<9;i++)
            if (! Character.isDigit(s.charAt(i)))
                return("SSN must have only digits.");
        if (s.length() != 9)
            return("An SSN length must be 9");

        return ("There is a serious error if this is printed!");
    }
}
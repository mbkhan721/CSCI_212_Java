package Lab23;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(isPalindrome("A Toyota"));
        System.out.println(isPalindrome("Not a palindrome"));
        System.out.println(isPalindrome("asdfghfdsa"));
    }

    public static boolean isPalindrome(String in) {
        if(in==null) {
            return false;
        }
        return isPalindromeHelper(in.toUpperCase());
    }

    private static boolean isPalindromeHelper(String in) {
        // base case
        if (in.length() <= 1) // if in is a single char, or ""
            return true;

        // use variables to save the first char and last char
        char first = in.charAt(0);
        char last = in.charAt(in.length() - 1);

        // check if the first and last is letter or not
        if (!Character.isLetter(first)) {
            return isPalindromeHelper(in.substring(1));
        }
        else if (!Character.isLetter(last)) {
            return isPalindromeHelper(in.substring(0, in.length() - 1));
        }

        // if the first char not equal to the last char
        if (Character.toLowerCase(first) != Character.toLowerCase(last))
            return false;

        // if equals
        return isPalindromeHelper(in.substring(1, in.length() - 1));

    }
}
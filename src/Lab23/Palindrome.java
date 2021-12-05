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
        // Fill me in
        return false;

    }
}
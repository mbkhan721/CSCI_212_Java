package Exam01;

/*
Write a complete main method that does the following:

Takes command line arguments (strings) and determines which string is the longest.
If there is not at least one command line argument, throw an IllegalArgumentException
with an appropriate message.

For example,

C:>java Question1 This is the input line
The longest word is: input.
 */

public class Question01 {

    public static void main(String[] args) {

        if (args.length == 0) {
            throw new IllegalArgumentException("Nothing entered.");
        }
        int index = 0;
        int inputLength = args[0].length();

        for (int i = 1; i < args.length; i++) {
            if (args[i].length() > inputLength) {
                index = i;
            }
        }
        System.out.println("The longest word is " + args[index]);
    }
}







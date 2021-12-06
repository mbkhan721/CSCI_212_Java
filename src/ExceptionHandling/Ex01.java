package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

//        try {
//            //some code that may throw an exception
//        }
//        catch (Exception e) {
//            String message = e.getMessage();
//            System.out.println("Aborting program.");
//            // OR
//            // System.out.println(message);
//            System.exit(0);
//        }

        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.println("Enter a whole number: ");
                number = keyboard.nextInt();
                done = true;
            }
            catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Not a correctly written whole num.");
                System.out.println("Try again.");
            }
        }
        System.out.println("You entered " + number);
    }
}

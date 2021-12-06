package ExceptionHandling;

import java.util.Scanner;

public class DivisionDemoFirstVersion {

    public static void main(String[] args) {

        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter a numerator: ");
            int numerator = keyboard.nextInt();
            System.out.println("Enter a denominator: ");
            int denominator = keyboard.nextInt();

            if (denominator == 0)
                throw new DivisionByZeroException();

            double quotient = numerator / (double)denominator;
            System.out.println(numerator + " / " + denominator + " = " + quotient);
        } // try

        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            secondChance();
        } // catch

        System.out.println("End of program.");
    } // main

    public static void secondChance() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Try again");
        System.out.println("Enter a numerator: ");
        int numerator = keyboard.nextInt();
        System.out.println("Enter a denominator: ");
        int denominator = keyboard.nextInt();

        if (denominator == 0) {
            System.out.println("I cannot do division by 0.");
            System.out.println("Aborting program...");
            System.exit(0);
        }
        double quotient = numerator / (double)denominator;
        System.out.println(numerator + " / " + denominator + " = " + quotient);
    }
}

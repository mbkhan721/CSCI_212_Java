package ExceptionHandling;

import java.util.Scanner;

public class DanceLesson {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number of male dancers: ");
        int men = keyboard.nextInt();

        System.out.println("Enter a number of female dancers: ");
        int women = keyboard.nextInt();

        try {
            if (men == 0 && women == 0)
                throw new Exception("Lesson is cancelled, no students.");
            else if (men == 0)
                throw new Exception("Lesson is cancelled, no men.");
            else if (women == 0)
                throw new Exception("Lesson is cancelled, no women.");

            if (women >= men)
                System.out.println("Each man must dance with " +
                        women / (double)men + " women.");
            else System.out.println("Each woman must dance with " +
                    men / (double)women + " men.");
        } // try

        catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
            System.exit(0);
        } // catch

        System.out.println("Begin the lesson.");

    } // main
}

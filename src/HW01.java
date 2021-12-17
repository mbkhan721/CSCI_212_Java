import java.util.Scanner;

public class HW01 {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Input your first name: ");
        firstName = input.nextLine();
        System.out.println("Input your last name: ");
        lastName = input.nextLine();

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName + "\t" + lastName);
        System.out.println(firstName + "\n" + lastName);

//        System.out.println("\nShopping Cart");
//        System.out.println("----------------------------------------");
//        System.out.println("#\t Item \t\t\t\t\t\t Cost");

    }

}

package Maps;

import PracticeExam02.Inheritance.Date;
import PracticeExam02.Inheritance.Employee;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        // First create a hashmap with an initial value of 10 and the default size
        // of load factor
        HashMap<String, Employee> employee = new HashMap<String, Employee>(10);

        // Add several objects to the map using their name as the keu
        employee.put("Joe", new Employee("Joe",
                new Date("September", 15, 1970)));
        employee.put("Andy", new Employee("Andy",
                new Date("August", 22, 1971)));
        employee.put("Greg", new Employee("Greg",
                new Date("March", 9, 1972)));
        employee.put("Kiki", new Employee("Kiki",
                new Date("October", 8, 1970)));
        employee.put("Antoinette", new Employee("Antoinette",
                new Date("May", 2, 1959)));
        System.out.print("Added Joe, Andy, Greg, and Kiki, ");
        System.out.println("And Antoinette to the map.");

        // ask the user to type a name. If name found in the map, print it out.
        Scanner keyboard = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("\nEnter a name to look up in the map. ");
            System.out.println("Press enter to quit.");

            name = keyboard.nextLine();
            if (employee.containsKey(name)) {
                Employee e = employee.get(name);
                System.out.println("Name found: " + e.toString());
            }
            else if (!name.equals("")) {
                System.out.println("Name not found");
            }
        }
        while (!name.equals(""));
    }

}

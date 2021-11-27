package PracticeExam02.Inheritance;

public class IsADemo {

    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Josephine",
                new Date("January", 1, 1995), 10000);

        HourlyEmployee sam = new HourlyEmployee("Sam",
                new Date("February", 1, 1996), 50.50, 40);

        System.out.println("\nJoe's longer name is " + joe.getName());
        System.out.println("showEmployee(joe) invoked:");
        showEmployee(joe);

        System.out.println("\nshowEmployee(sam) invoked:");
        showEmployee(sam);

    }

    public static void showEmployee(Employee employeeObject) {
        System.out.println(employeeObject.getName());
        System.out.println(employeeObject.getHireDate());
    }
}

package PracticeExam02.Inheritance;

public class SalariedEmployee extends Employee {

    private double salary; // annual

    public SalariedEmployee() {
        super(); // if this line is omitted, java still invokes the no-args constr for base class
        salary = 0;
    }

    /**
     * Precondition: Neither theName noe theDate is null;
     * theSalary is non-negative.
     */

    public SalariedEmployee(String theName, Date theDate, double theSalary) {
        super(theName, theDate);
        if (theSalary >= 0)
            salary = theSalary;
        else {
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }

    public SalariedEmployee(SalariedEmployee originalObject) {
        super(originalObject);
        salary = originalObject.salary;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Returns the pay for the month.
     */
    public double getPay() {
        return salary / 12;
    }

    /**
     * newSalary is non-negative.
     */
    public void getSalary(double newSalary) {
        if (newSalary >= 0)
            salary = newSalary;
        else {
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }

    public String toString() {
        return (getName() + " " + getHireDate().toString() + "\n$" + salary + " per year");
    }

    public boolean equals(SalariedEmployee other) {
        return (getName().equals(other.getName())
        && getHireDate().equals(other.getHireDate())
        && salary == other.salary);
    }


}




















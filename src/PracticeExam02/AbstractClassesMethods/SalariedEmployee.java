package PracticeExam02.AbstractClassesMethods;

import PracticeExam02.Inheritance.Date;

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

    public double getPay() {
        return salary / 12;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else {
            SalariedEmployee otherSalariedEmployee = (SalariedEmployee) otherObject;
            return (super.equals(otherSalariedEmployee) && (salary == otherSalariedEmployee.salary));
        }
    }
}

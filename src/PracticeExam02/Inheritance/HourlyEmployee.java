package PracticeExam02.Inheritance;

public class HourlyEmployee extends Employee {

    private double wageRate;
    private double hours; // for the month

    public HourlyEmployee () {
        super(); // if this line is omitted, java will still invoke
                 // the no-args constr for the base class.
        wageRate = 0;
        hours = 0;

    }

    public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours) {
        super(theName, theDate);
        if ((theWageRate >= 0) && (theHours >= 0)) {
            wageRate = theWageRate;
            hours = theHours;
        }
        else {
            System.out.println("Fatal Error creating an illegal hourly employee.");
            System.exit(0);
        }
    }

    public HourlyEmployee (HourlyEmployee originalObject) {
        super(originalObject); // An object of the class HourlyEmployee is also an
                               // instance of the class Employee.
        wageRate = originalObject.wageRate;
        hours = originalObject.hours;
    }

    public double getRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getPay() {
        return wageRate * hours;
    }

    public void setHours(double hoursWorked) {
        if (hoursWorked >= 0)
            hours = hoursWorked;
        else {
            System.out.println("Fatal Error: Negative hours worked");
            System.exit(0);
        }
    }

    public void setRate(double newWageRate) {
        if (newWageRate >= 0)
            wageRate = newWageRate;
        else {
            System.out.println("Fatal Error: Negative wage rate.");
            System.exit(0);
        }
    }

    public String toString() { // toString method is overridden so it is different in the derived class
        return (getName() + " " + getHireDate().toString() + "\n$" + wageRate
                + " per hour for " + hours + " hours");
    }

    public boolean equals(HourlyEmployee other) {
        return (getName().equals(other.getName())
        && getHireDate().equals(other.getHireDate())
        && wageRate == other.wageRate
        && hours == other.hours);
    }


}
















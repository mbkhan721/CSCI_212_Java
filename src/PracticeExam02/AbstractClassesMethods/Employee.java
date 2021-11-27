package PracticeExam02.AbstractClassesMethods;

import PracticeExam02.Inheritance.Date;

public abstract class Employee {

    private String name;
    private Date hireDate;

    public abstract double getPay();

    public Employee() {
        name = "No name";
        hireDate = new Date("January", 1, 1000); // just a placeholder
    }

    public Employee(String theName, Date theDate) {
        if (theName == null || theDate == null) {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public String getName() {
        return name;
    }
    public Date getHireDate() {
        return new Date(hireDate);
    }

    public void setName(String newName) {
        if (newName == null) {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        else
            name = newName;
    }

    public void setHireDate(Date newDate) {
        if (newDate == null) {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }

    public Employee(Employee originalObject) {
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);
    }

    public boolean samePay(Employee other) {
        if (other == null) {
            System.out.println("Error: null Employee object.");
            System.exit(0);
        }
        // else
        return (this.getPay() == other.getPay());
    }


}

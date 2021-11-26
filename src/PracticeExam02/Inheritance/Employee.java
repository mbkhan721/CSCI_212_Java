package PracticeExam02.Inheritance;

public class Employee {

    private String name;
    private Date hireDate;

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

    public Employee(Employee originalObject) {
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);
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

    public String toString() {
        return (name + " " + hireDate.toString());
    }

    public boolean equals(Employee otherEmployee) {
        return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
    }

}

/*
1 - Understand what methods and data items are inherited from a super class when they are declared
public, private and protected.

 */


// pg 430
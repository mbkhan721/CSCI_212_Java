package PracticeExam02.Interfaces;

import PracticeExam02.AbstractClassesMethods.HourlyEmployee;

public class OrderedHourlyEmployees extends HourlyEmployee implements Ordered {

    public boolean precedes(Object other) {
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployees))
            return false;
        else {
            OrderedHourlyEmployees otherOrderedHourlyEmployees = (OrderedHourlyEmployees)other;
            return (getPay() < otherOrderedHourlyEmployees.getPay());
        }
    }

    public boolean follows(Object other) {
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployees))
            return false;
        else {
            OrderedHourlyEmployees otherOrderedHourlyEmployees = (OrderedHourlyEmployees)other;
            return (otherOrderedHourlyEmployees.precedes(this));
        }
    }
}

// pg 719





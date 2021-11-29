package PracticeExam02.Interfaces;

public interface Ordered {

    public boolean precedes(Object other);
    /**
     * For objects of the class o1 and o2,
     * o1.follows(02) == 02.precedes(01).
     */
    public boolean follows(Object other);
}

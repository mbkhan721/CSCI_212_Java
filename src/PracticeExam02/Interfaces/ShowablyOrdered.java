package PracticeExam02.Interfaces;

public interface ShowablyOrdered extends Ordered {

    /**
     * Outputs an object of the class that precedes the calling object.
     */
    public void showOneWhoPrecedes();

    /*
    A concrete class that implements the ShowablyOrdered interface must have a
    definition for the method showOneWhoPrecedes and also have definitions for
    the methods precedes and follows given the Ordered interface.
     */
}

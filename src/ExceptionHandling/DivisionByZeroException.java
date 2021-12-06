package ExceptionHandling;

public class DivisionByZeroException extends Exception{

    public DivisionByZeroException() {
        super("Division by zero");
    }

    public DivisionByZeroException(String message) {
        super(message); // super is an invocation of the constructor for the base class Exception
    }
}

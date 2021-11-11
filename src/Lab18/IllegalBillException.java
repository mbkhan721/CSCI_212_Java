package Lab18;

public class IllegalBillException extends IllegalArgumentException{

    public IllegalBillException() {
        super(); // super references to parent class constructor
    }

    public IllegalBillException(String message) {
        super(message);
    }

    
}

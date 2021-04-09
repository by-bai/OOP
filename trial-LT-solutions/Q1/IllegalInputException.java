// to be thrown when an illegal input is obtained
public class IllegalInputException extends RuntimeException {
    // constructor that takes in the exception message

    public IllegalInputException(String msg) {
        super(msg);
    }
}
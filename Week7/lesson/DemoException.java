// unchecked exception -> extends RuntimeException
// checked exception -> extends Exception


public class DemoException extends RuntimeException {

    // no args constructor
    public DemoException() {

    }

    // error message
    public DemoException(String msg) {
        super(msg); // message inherited from super class (RuntimeException)
    }

    //Throwable is the mother of all exceptions
    public DemoException(String msg, Throwable e) {
        super(msg, e); 
    }
}



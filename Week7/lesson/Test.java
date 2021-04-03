import java.util.*;
import java.io.*;
import java.util.logging.*; 

// caller of the method has 2 options 
// 1. handle it or 2. propagate it 

// a demo exception is an exception
// but an exception might not be a demoexception 

// throws Exception --> caller of the method must be throws Exception cannot be throws DemoException
// doX promise to throw Exception. whoever that invoke doX will only look at the warning given
// therefore doY (caller) must look at the warning - Exception - doY don't want to handle it
// so doY need to pass on the responsibility - have to be the SAME responsibility aka Exception (any kind of exception)

// lazy dev will just catch Throwable lol
// -> but cannot write code that specifically recoveere from all errors

// UI <-> Controller <--> DataAccessObject <-> Database 

    // DAO - sql statements, file reading and writing, talk to nosql if using nosql
    // DAO -> DataAccessObject -> Serverside Design Pattern 
    // DAO hides the implementation

// Every class follows Single Responsibility Principle (SRP) 

// think through how you want to deal with Exceptions -> unchecked/checked
    // log it to file one time - should i terminate program? is it an important program?
    // serious error? log -> terminate -> show appropriate error message?
    // display error at ui side and get client to change behaviour?

// java don't expect you to handle unchecked exception like ArithmeticException
// you can CHOOSE to show it. show or dont show can compile 
// "throws ArithmeticException" & handle it -> ok
// don't throw and handle also ok. 

public class Test {

    // throws -> giving the warning 
    public static void doX(int x, int y) throws Exception {
        // as long as there is a warning "throws Exception", 
        // must handle it using try-catch 
        // no matter whether there's anything inside the {} body
        // throw new Exception(); 

        System.out.println(x/y);
    
    }

    public static void doY(int x, int y) throws DemoException {
        try {
            doX(x, y);
        }
            catch (ArithmeticException e) {
                // nested exception - commonly used in Java applications to identify the root cause

                throw new DemoException("Divide by zero .. oops", e); 
            }
        }
    
    
    public static void main(String[] args) {
        // 1. throws Exception -> pass the responsibility to someone else
        // 2. try-catch

        try {
            doY(1, 0); 
        } catch (Exception e) {
            // 1. code on how to recover from the error 
            // 2. e.printStackTrace();
            ///System.out.println("Something wrong .. Please contact support"); 
            // must write code here if not you're "swallowing the exception" 
              // --> even if an error occurs you won't know about it.
              // catch and do nothing --> program will still run. 

            // Logging framework
            // java.util.logging package
            // opensource Library: Log4j

            ///Logger logger = Logger.getLogger("test"); 
            ///logger.info("test");
            // logger.log(Log.WARNING, "test", e); 
            ///logger.log(Level.SEVERE, "test", e); 

            e.printStackTrace();
        }
        
    }
}
import java.io.*; 

public class ExceptionDemo1 {
    public static void main(String[] args){
        try {
            int iResult = 1/0; 
        } 
        catch (NullPointerException e) {
            System.out.println("catch-1"); 
        }
        catch (ArithmeticException e) { 
            System.out.println("catch-2"); 
        }
    }
} 
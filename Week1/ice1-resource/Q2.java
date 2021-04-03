import java.util.*;

import javax.security.sasl.SaslClient;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word:");
        String firstWord = sc.next();
        System.out.print("Enter second word:");
        String secondWord = sc.next();
        
        // primitive type (char) use == for comparison instead of equals()
        while ((firstWord.charAt(0)) != (secondWord.charAt(0))) {
            System.out.println("try again"); 
            System.out.print("Enter first word:");
            firstWord = sc.next();
            System.out.print("Enter second word:");
            secondWord = sc.next();
        }
       
        System.out.println("Bingo"); 

    }

}
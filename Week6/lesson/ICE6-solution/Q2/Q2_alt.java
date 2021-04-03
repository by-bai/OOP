import java.io.*;
import java.util.*;

public class Q2_alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        boolean valid = false;

        while( !valid ){
            try (Scanner fileSc = new Scanner(new File(filename)) ) {
                int total = 0;
                while( fileSc.hasNext() ) {
                    total += Integer.parseInt(fileSc.nextLine());
                }
                System.out.printf("The sum is %d", total);
                valid = true;
            } catch (FileNotFoundException e) {
                System.out.println(filename +" is invalid");
                System.out.print("Enter filename> ");
                filename = sc.nextLine();
            }    
        }
    }
    
}
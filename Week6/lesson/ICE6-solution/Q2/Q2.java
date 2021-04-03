import java.io.*;
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner fileSc = null;
        
        while (fileSc == null) {
            System.out.print("Enter filename> ");
            String filename = sc.nextLine();
            try {                
                fileSc = new Scanner(new FileInputStream(filename));
            } catch (FileNotFoundException e) {
                System.out.println(filename + " is invalid");
            }
        }

        try {
            int sum = 0;
            while (fileSc.hasNext()) {
                sum += fileSc.nextInt();
            }
            System.out.println("The sum is " + sum);
        } finally {
            if (fileSc != null) {
                fileSc.close();
            }
        }
        
    }
}
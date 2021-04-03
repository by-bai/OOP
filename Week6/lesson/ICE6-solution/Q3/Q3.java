import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        
        try(Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            fileSc.useDelimiter(",|\r\n|\n");

            while(fileSc.hasNext()) {
                // read 3 numbers since it is always 3 numbers per row
                System.out.println(fileSc.nextInt() + fileSc.nextInt() 
                        + fileSc.nextInt());
            }
        } catch(FileNotFoundException e) {
            System.out.println(filename + " is not found");
        }
    }
    
}
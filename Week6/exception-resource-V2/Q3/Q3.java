import java.util.Scanner;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter filename> "); 
        String filename = sc.next(); 

        try(Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            fileSc.useDelimiter(",|\r\n|\n");
            
            while (fileSc.hasNext()) { // 1 line
                System.out.println(fileSc.nextInt() + fileSc.nextInt() + fileSc.nextInt()); // sum 3 numbers per line
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");  
        }
    }

}
import java.util.Scanner;
import java.io.*; 

public class Q2 {
    public static void main(String[] args) {
        int sum = 0; 
        String userInput = "";
        boolean isValid = false; 
        

        while (!sValid) {
            // try with resource
            // try (Scanner fileSc = new Scanner(new File(filename))) { 
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter filename: ");
    
                userInput = sc2.nextLine(); 
                Scanner sc = new Scanner(new File(userInput)); // throws an exception
                
                // so if it doesn't throw an exception means the file input is ok,
                // stop the while loop of prompting user for a file name!!
                isValid = true;  

                while (sc.hasNext()) {
                    sum += sc.nextInt();
                    sc.nextLine(); 
                    
                }
                System.out.println("The sum is " + sum); 
                
            
            }
            catch (FileNotFoundException e) {
                System.out.println(userInput + " is invalid"); 
            }
        }
        


    }
    
}

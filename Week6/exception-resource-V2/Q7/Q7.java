import java.util.*;
import java.io.*;

public class Q7 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename > ");
        String filename = sc.next(); 

        try (Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            

            while (fileSc.hasNextLine()) {
                
                ArrayList<Integer> intList = new ArrayList<>();

                Scanner lineSc = new Scanner(fileSc.nextLine());
                lineSc.useDelimiter(",|\r\n|\n");

                while (lineSc.hasNext()) {
                    intList.add(lineSc.nextInt()); 
                }
                
                String output = ""; 
                for (int i = intList.size() - 1 ; i >= 0; i--) {
                     output += intList.get(i) + ","; 
                }
                
                System.out.println(output.substring(0, output.length() - 1)); 
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + " cannot be found"); 
        }


    }
    
    
}
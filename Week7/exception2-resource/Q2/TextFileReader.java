import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 

public class TextFileReader {
    public static void main(String[] args) {

        String fileNameAndPath = "data/students.txt";
        

        // file exist method
        long start = System.currentTimeMillis();
        File f = new File(fileNameAndPath);  

        if (f.exists()) {
            System.out.println("Yes, " + fileNameAndPath + " exists"); 
        } else {
            System.out.println("No, " + fileNameAndPath + " does not exist"); 
        
        }

        System.out.println("It took " + (System.currentTimeMillis() - start + " milliseconds"));

        // exception method
        start = System.currentTimeMillis();
        
        try {
            Scanner sc = new Scanner(new File(fileNameAndPath));
            System.out.println("Yes, " + fileNameAndPath + " exists"); 

        } catch (FileNotFoundException e) {
            System.out.println("No, " + fileNameAndPath + " does not exist"); 
        }

        System.out.println("It took " + (System.currentTimeMillis() - start) + " milliseconds");

    }
}

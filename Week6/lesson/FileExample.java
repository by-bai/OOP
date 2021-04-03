import java.io.FileNotFoundException;
import java.io.File; 
import java.util.Scanner; 

public class FileExample {
    public static void main(String[] args) {
        // try with resources??? 
        try {

            Scanner sc = new Scanner(new File("numbers.txt")); 
            // sc.useDelimiter(",|\n"); // apple,1 is separated by comma
            // and also end of line corrector
            // for windows: (",|\r\n"); 
            // whats the \\t for??
            sc.useDelimiter("\\t|\n"); 

            while (sc.hasNext()) {
                System.out.println("first: " + sc.next()); 
                System.out.println("second value: " + sc.next()); 
            }

            
            // below code assumes only 3 lines
            // System.out.println(sc.nextLine()); 
            // System.out.println(sc.nextLine()); 
            // System.out.println(sc.nextLine()); 

            // the following code below does not assume the no. of lines that the file contains
            // while (sc.hasNext()) {
            //     System.out.println(sc.nextLine()); 
            // }

            // while (sc.hasNext()) {
            //     String[] arr = sc.nextLine().split(","); 
            //     System.out.println("Left:" + arr[0]);
            //     System.out.println("Right:" + arr[1]);
    
            // }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found"); 
        }

        finally {
            if (sc != null) {
                sc.close(); 
            }
        }
    }
}

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(new FileOutputStream("numbers.txt", false))) {
            out.println("coconut, 100");
    } catch (FileNotFoundException e) {
        System.out.println("File is not found"); 
    }
}

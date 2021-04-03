import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine(); 
        // sc.next() only returns what comes before whitespace
        // sentence = sentence.split(" "); --> type mismatch: cannot convert from String[] to String
        String[] tokens; 
        tokens = sentence.trim().split(" "); 

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=(tokens.length-1); i>=0; i--){
            stringBuilder.append(tokens[i]); 
            stringBuilder.append(" "); 
            
        }
        String reversedSentence = stringBuilder.toString();

        System.out.println(reversedSentence); 
    }
}
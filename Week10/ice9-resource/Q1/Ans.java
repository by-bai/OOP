import java.util.*;

public class Ans {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>(); 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word> ");
        String word = sc.nextLine(); 

        while(!word.equals("")) {
            Integer count = freq.get(word);

            if (count == null) {
                count = 0;
            }

            freq.put(word, count + 1);

            System.out.print("Enter the word> ");
            word = sc.nextLine();

        }   
        
        System.out.println();
        System.out.println("Frequency count: ");

        Set<String> keys = freq.keySet();
        for (String key : keys) {
            System.out.println(key + " " + freq.get(key)); 
        }


    
    }
    
}

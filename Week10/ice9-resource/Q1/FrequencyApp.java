import java.util.*; 

public class FrequencyApp {
    public static void main(String[] args) {
        HashMap<String, Integer> freq = new HashMap<>(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word> ");
        String word = sc.nextLine(); 
        
        
        //if word not equals to ""
        while (!word.equals("")) {
            Integer count = freq.get(word); //get the count given the word
            if (count == null) { //if count is null, start from 1, else +1
                count = 1;
            } else {
                count += 1;
            }
            freq.put(word, count); //update word (key) with new count (value)

            System.out.print("Enter the word> ");
            word = sc.nextLine();
        }

        System.out.println("Frequency Count:"); 

        Set<String> words = freq.keySet();
        for (String key : words) {
            System.out.println(freq.get(key) + " " + key);
        }
        
        
    }

}

    

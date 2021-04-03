import java.util.*;

public class MapUtility {


    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");


        System.out.println("Input:  " + input);
        Map<String,List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }

    public static Map<String,List<String>> reverse (Map<String,String> original) {
        HashMap<String,List<String>> reversed = new HashMap<>(); 
        
        Set<String> keys = original.keySet(); 
        for (String key : keys) { 
            String score = original.get(key); // retrieve score from original map given key (name)
            List<String> names = reversed.get(score); // retrieve name from new map given key (score)

            // if name is null, create list and add name inside
            // if name not null, add name to list
            if (names == null) {
                List<String> arr = new ArrayList<>();
                arr.add(key); 
                names = arr;
            } else {
                names.add(key); 
            }

            reversed.put(score, names); 
        }

        return reversed; 
         
    }
}

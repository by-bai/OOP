import java.util.Scanner;

public class W10Map {

    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("apple", 10);
        inventory.put("orange", 15);
        inventory.put("pear", 4);
        inventory.put("durian", 3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String namee = sc.nextLine();

        Collection<String> values = inventory.keySet();
        for (String key : values) {
            if (key.equals(name)) {
                System.out.println("Your stock is " + inventory.get(key));
            }
        }

        System.out.println(inventory.get(name)); 
    }
    
}

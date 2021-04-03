import java.util.*; 

public class UnionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first line> "); 
        String firstLine = sc.next();
        System.out.print("Enter the second line> ");
        String secondLine = sc.next();
        
        String[] arr1 = firstLine.split(",");
        String[] arr2 = secondLine.split(",");

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, arr1); 
        Collections.addAll(collection, arr2); 

        ArrayList<Integer> arr = new ArrayList<>();
        
        Iterator<String> iterator = collection.iterator(); 
        while (iterator.hasNext()) {
            arr.add(Integer.valueOf(iterator.next()));
        }
        Collections.sort(arr); 

        Set<Integer> set = new HashSet<>(arr); 
        System.out.println(set); 
    }
}
public class Set2 {
    public static void main(String[] args) {
        List<String> values = List.of("apple","orange","pear")
        // list.of -> immutable list

        Set<String> inventory = new TreeSet<>();
        inventory.addAll(values); 
        System.out.println(inventory); 
    }
}

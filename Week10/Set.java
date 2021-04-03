public class Set {
    public static void main(String[] args) {
        Set<String> inventory = new TreeSet<>();
        inventory.add("apple");
        inventory.add("orange");
        inventory.add("pear");
        inventory.add("durian");
        
        System.out.println(inventory);

        //things sorted -> treeset o(log n)
            //output: [apple, durian, orange, pear]
            //in order of string sorting
            //string: a comes before b
            //integer: 1 comes before 2
        //not sorted -> hashmap o(1) 
            //output: [orange, apple, pear, durian]
    }
}

public class W10List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("orange");
        list.add("pear");

        for (int i = 0; i<list.size(); i++) {
            if(list.get(i).equals("orange")) {
                list.remove(i); 
            }
        }
        System.out.println(list); //[apple,orange,pear]
    }
}

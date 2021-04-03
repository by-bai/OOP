import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Set3 {
    public static void main(String[] args) {
        Set<Person> s = new HashSet<>();
        s.add(new Person("apple")); 
        s.add(new Person("orange"));
        s.add(new Person("apple"));
        System.out.println(s);
    }
    //prints out [apple, apple, orange]; 
    //if override hashcode in person class 
        // removes duplicates -> prints out [apple,orange]

    // hashing - function takes in key generates numerical value and decide which compartment
    // if you dont override hashcode - it wont generate the same value at all
    // Person p1 = new Person("apple");
    // Person p2 = new Person("apple"); 
    // System.out.println(p1.equals(p2)) --> returns true, BUT
    // Sysout(p1.hashCode() & sysout(p2.hashcode(0)) --> returns different hash numbers
    // modulo by array size??? 

    //equals method : Note that it is generally necessary to override the
        //  hashCode method whenever this method is overridden, 
        // so as to maintain the general contract for the hashCode method, 
        // which states that equal objects must have equal hash codes.
}       

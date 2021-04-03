import java.util.*; 

public class Example {
    
    // bubble sort, timsort (Python)
    // quick sort, selection sort

    public static void main(String[] args) {
        //List<Person> values = new ArrayList<>();

        //immutable
        List<Person> values = List.of(new Person(3),
        new Person(1),
        new Person(2)); 
        
        //turn immutable list to mutable list?
        List<Person> mutableValues = new ArrayList<>(values); 
        Collections.sort(mutableValues, new PersonComparator());
        // what does PersonComparator do??? 
        Collections.sort(values); // requires mutable list 
    }
}

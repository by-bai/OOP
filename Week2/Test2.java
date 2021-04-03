//packages
//import java.lang.*; --> java imports this for you automatically (for String etc)
import java.util.*; //whenever u need to use array

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        // kawaii signs ensure everything in arraylist contains e.g. string 
        // if you insert smth else e.g. object then it will not compile
        //x.add("abc");
        //x.add(new Person(1, 'M', "name")); 
        // String s = "abc";

        x.add(2); // same as python .append()
        int value = x.get(0); // unboxing
        
        //process of boxing & unboxing --> autoboxing 
    }    
}

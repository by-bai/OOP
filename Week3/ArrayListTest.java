// Array List is a class inside java.util package
import java.util.*; 

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Dish> container = new ArrayList<>();

        // Array List -> you want a collection of objects, want to treat them uniformly
        // ensure that everything added to the array list are dish objects
        
        

        container.add(new Dish("laksa", 5));
        container.add(new Dish("chicken rice", 4.5));

        // container.add("abc"); --> this cannot compile now due to ArrayList<Dish>
        
        Dish dish = container.get(1); 
        System.out.println(dish.getPrice()); 

        // loop through every address inside the container
        for (int i = 0; i < container.size(); i++) {
            Dish dish = container.get(i);
            // System.out.println(dish.getPrice()); 
        }
       
        // System.out.println(container.size());
          
        /* Array List class
        .add() - add address to container
        .size() - how many address in the arraylist
        .get() - get a specific address stored inside the container

        */
    }
}
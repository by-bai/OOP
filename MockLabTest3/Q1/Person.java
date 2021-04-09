import java.util.*;

public class Person implements Comparable<Person>{
    // Do not change : start
    private String name;
    private List<Item> items = new ArrayList<>();
    
    public Person(String name) {
        this.name = name;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public String toString() {
        return name + " " + items;
    }
    // Do not change : end

    public double getPrices(List<Item> items){
        double sum = 0;
        for (Item item : items) {
            if (item instanceof ValuableItem) {
                ValuableItem v = (ValuableItem) item;
                sum += v.getPrice();
            }
            
        }
        return sum; 
    }
    public int compareTo(Person another) {

        double prices = getPrices(items);
        double anotherPrices = another.getPrices(another.items);
        if (prices > anotherPrices) {
 
            // if current object is greater,then return -1
            return -1;
        }
        else if (prices < anotherPrices) {
 
            // if current object is greater,then return 1
            return 1;
        }
        else {
 
            // if current object is equal to o,then return 0
            return 0;
        }
        
    }
   
       
    
    
}
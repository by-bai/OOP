import java.util.*;
import java.io.*; 

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("orange", 5, 3.2));
    products.add(new Product("pear", 2, 1.1));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    
    try (PrintStream out = new PrintStream(new FileOutputStream(pathAndFileName, true))){ 

      for (Product product : productList) {
        String name = product.getName();
        int quantity = product.getQuantity();
        Double price = product.getPrice(); 

        out.printf("%s,%d,%.2f%n", name, quantity, price); 
      } 
    }
    catch (FileNotFoundException e) {
          e.printStackTrace();
      
    } 
  }
}

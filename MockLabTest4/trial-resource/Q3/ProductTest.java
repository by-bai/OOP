import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {
    
    public static void main(String[] args) {
        boolean invalid = true; 
        while (invalid) {
            try { 
                Scanner sc = new Scanner(System.in);
            System.out.print("Enter product name : ");
        
            String name = sc.nextLine();

            System.out.print("Enter product code : ");
            String productCode = sc.nextLine();
            Product.validate(productCode);
            
            System.out.print("Enter product price : ");
            double price = sc.nextDouble();
            if (price < 0) {
                throw new IllegalArgumentException("Price must be positive"); 
            }

            

            Product p = new Product(name, productCode, price);
            System.out.println("The discounted price is " + p.getDiscountedPrice());



            invalid = false;
            
        
        }catch(InvalidProductException e){
            System.out.println("Invalid Product Code! Please try again!");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //System.out.println();
    }
}
}

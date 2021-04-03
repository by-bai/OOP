import java.io.*;
import java.util.Scanner; 

public class InventoryApp {

    public static void stockTaking(String fileNameandPath){

        try (Scanner sc = new Scanner(new File(fileNameandPath))) {
            sc.useDelimiter(",|\r\n|\n");
            int totalQuantity = 0;
            double totalPrice = 0.0; 

            while (sc.hasNext()) {

                int quantity = sc.nextInt();
                String name = sc.next(); 
                double price = sc.nextDouble(); 

                totalQuantity += quantity;
                totalPrice += quantity * price; 

                System.out.printf("There are %d %s, each cost $%.2f %n", quantity, name, price);

            }

            System.out.printf("There are %d products with a total value of $%.2f to be sold. %n", totalQuantity, totalPrice); 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }
    }

    public static void main(String[] args) {
        stockTaking("product.csv");
    }
}

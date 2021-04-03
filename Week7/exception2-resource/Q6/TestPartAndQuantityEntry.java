import java.util.Scanner;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        int partNumber = 0;
        int orderQty = 0; 
        boolean invalid = true; 

        PartAndQuantityEntry entry = new PartAndQuantityEntry();

        while (invalid) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter part number> "); 
            partNumber = sc.nextInt();
            System.out.print("Enter quantity> "); 
            orderQty = sc.nextInt();

            try { 
                entry.enterPartAndQuantity(partNumber, orderQty); 
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        
     

        
        
    }
}

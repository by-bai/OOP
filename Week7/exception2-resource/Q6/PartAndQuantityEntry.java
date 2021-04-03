public class PartAndQuantityEntry {
    
    public void enterPartAndQuantity (int partNumber, int orderQty) throws IllegalArgumentException {
        if ( (partNumber < 0) || (partNumber > 999) || (orderQty < 1) ||
         (orderQty > 5000) ) {
            throw new IllegalArgumentException("Invalid order, part number should be between 0 and 999, quantity ordered between 1 and 5000");
        } else {
            System.out.println("Successfully inserted order"); 
        }
    } 
}

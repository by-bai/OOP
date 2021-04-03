public class Demo {
    
    public void enterIntoDatabase(String id, String name, int age) throws InvalidParaException {
        // validate data

        if (id.length() == 0 || name.length == 0) {
            throw new InvalidParaException("invalidate name or ID");
        } else if (yearOfBirth < 21) {
            throw new InvalidParaException("age is below 21");
        } 

        // perform steps to enter into database...
        // ...
        
        return; // success 
        }
    }
} 

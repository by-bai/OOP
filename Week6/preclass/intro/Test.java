public class Test { 
    public static void main(String[] args) {
        Demo d = new Demo();
        
        try{
            d.enterIntoDatabase("abc", "some name", 30);

        }

        catch (InvalidParaException e) {
            System.out.println("error: " + e.getMessage()); 
        }
    }
}


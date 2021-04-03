public class Q7 {
    public static void main(String[] args) {
  
        String[] days = {
                "first", "second", "third", "fourth", 
                "fifth", "sixth", "seventh", "eighth", 
                "ninth", "tenth", "eleventh", "twelfth"
                };
        
       

        for (int i = 0; i<days.length; i++){
            System.out.println("On the " + days[i] + " of Christmas, my true love sent to me"); 

            switch(i){
                // fall through: no break statements 
                case 11: 
                System.out.println("Twelve drummers drumming, ");

                case 10: 
                System.out.println("eleven pipers piping, ");

                case 9: 
                System.out.println("ten lords a-leaping, ");

                case 8: 
                System.out.println("nine ladies dancing, ");

                case 7: 
                System.out.println("eight maids a-milking, ");

                case 6: 
                System.out.println("seven swans a-swimming, ");

                case 5: 
                System.out.println("six geese a-laying, ");

                case 4: 
                System.out.println("Five golden rings. ");

                case 3: 
                System.out.println("Four calling birds, ");

                case 2: 
                System.out.println("three French hens, ");

                case 1: 
                System.out.println("two turtle doves and ");

                default:
                System.out.println("A partridge in a pear tree. ");


                
            }

            
        }

    

        
        
    }
}
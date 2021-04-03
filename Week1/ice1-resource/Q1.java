public class Q1 {

    public static int sumOfDigits(int number) {
        // get absolute value of number
        number = Math.abs(number); 
        // convert number (int -> str) to loop
        String numString = "" + number; 
        // for loop to sum up digits
        int numSum = 0; 
        
        for (int i=0; i<numString.length(); i++){
            // get digit string
            String digitString = "" + numString.charAt(i); 
            // add value from digit string to sum (int)
            numSum += Integer.valueOf(digitString); 
        }
        return numSum; 

        /* this can't work because cannot add int + string together? 
        
        for (int i=0; i<numString.length(); i++){
            numSum += numString.charAt(i); 
        }
        
        */

    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}

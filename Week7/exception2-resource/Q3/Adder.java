import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        // boolean isValid = false;
        // while (!isValid)

        while (true) {

            System.out.print("Enter num 1> ");

            try { 
                num1 = sc.nextInt(); 
                break; //isValid = true;
            } catch (Exception e) {
                System.out.println("Please enter a number!"); 
                sc.next(); // flush out a from the scanner
                // without this, a will be stuck inside and cause and infinite while loop
                    // "Enter num1> Please enter a number" .... (infinite)  
            }
        }
    
        System.out.println();

        while (true) {
            System.out.print("Enter num 2> ");

            try {
                num2 = sc.nextInt();
                break; 
            } catch (Exception e) {
                System.out.println("Please enter a number!"); 
                sc.next(); 
            }
        }

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);
    }
}
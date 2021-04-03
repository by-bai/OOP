import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3alt {
    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt(); 
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number"); 
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int num1 = getNumber("Enter num 1> ");
        int num2 = getNumber("Enter num 2> ");
        System.out.println("The answer is " + (num1 + num2)); 
    }
}

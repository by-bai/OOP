import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt(); 
        int product = num; 
        String output = num + "";  

        if (num<0){
            System.out.println("No positive number is entered");
        } else {
            while (num>=1){
                System.out.print("Enter number:");
                num = sc.nextInt(); 
                if (num>0){
                    product *= num; 
                    output += " x " + num; 
                }
        
            }
            System.out.print(output + " = "); 
            System.out.println(product); 
        }
        

    
}
}
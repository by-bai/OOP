import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        // part a
        System.out.print("Enter size: "); 

        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 

        for (int i=0; i<size; i++){
            // get alphabet 

            // cast int to char (e.g. 97 --> 'a')
            // mod 26 cos to keep i <=26 cos 26 alphabets
            System.out.print((char)('a' + i%26) + " ");
        }

        System.out.println();

        // part b
        for (int i=1; i<=size; i++){
            System.out.print(i);
            System.out.print(i+1);
            System.out.print(i+2 + " ");
        }

        System.out.println();

        // part c
        String output = "";

        for (int i=1; i<=size; i++){
            output += i; 
            System.out.println(output); 
        }
        
    }
}
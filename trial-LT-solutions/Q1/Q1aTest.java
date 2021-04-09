// You can alter this class, but it won't be marked.

public class Q1aTest {

    public static void main(String[] args) {

        // (i) test combineTwoArrays
        char[] a = {'a', 'p', 'p', 'l', 'e'};
        char[] b = {'1', '2', '3', '4', '5'};
        char[] result1 = Q1a.combineTwoCharArrays(a, b);

        // should print a1p2p3l4e5
        System.out.println("Expected: a1p2p3l4e5");
        System.out.print("Result  : ");
        for (char c : result1) {
            System.out.print(c);
        }
        System.out.println();

        // should catch an exception
        try {
            char[] x = {'a'};
            char[] y = {'1', '2', '3', '4', '5'};
            char[] z = Q1a.combineTwoCharArrays(x, y);
        } catch (IllegalInputException e) {
            System.out.println("\nExpected: exception:");
            System.out.println("Caught IllegalInputException with message " + e.getMessage());
        }
    }
}

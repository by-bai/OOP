// You can do anything you want with this class, but it won't be marked.

public class Q1dTest {

    public static void main(String[] args) {

        int[] sortedA = {1, 5, 7, 8, 10, 55};
        int[] sortedB = {2, 5, 5, 13, 18, 54, 60};
        int[] result2 = Q1d.combineTwoIntArraysSorted(sortedA, sortedB);

        System.out.println("Expected: 1, 2, 5, 5, 5, 7, 8, 10, 13, 18, 54, 55, 60,");
        System.out.print("Result  : ");
        for (int i : result2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();

        // swap - pass in sortedB first then  sortedA
        int[] sortedC = {54, 60};
        int[] sortedD = {55};
        int[] result3 = Q1d.combineTwoIntArraysSorted(sortedC, sortedD);

        System.out.println("Expected: 54, 55, 60,");
        System.out.print("Result  : ");
        for (int i : result3) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();

        // should catch an exception
        try {
            int[] sortedA1 = {1, 5, 7, 8, 10, 55};
            int[] sortedB1 = null;
            int[] fakeResult = Q1d.combineTwoIntArraysSorted(sortedA1, sortedB1);
        } catch (IllegalInputException e) {
            System.out.println("Caught IllegalInputException with message " + e.getMessage());
        }
    }
}

// You can do anything you want with this class, but it won't be marked.

public class Q1fTest {

    public static void main(String[] args) {

        // test flip
        int[][] number1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] number1Flipped = Q1f.flip(number1);
        System.out.println("Expected: \n1 3 5\n2 4 6\n");
        System.out.print("Result  :\n");
        for (int[] d1 : number1Flipped) {
            for (int d2 : d1) {
                System.out.print(d2 + " ");
            }
            System.out.println();
        }

        int[][] number2 = {{88, 9, 4, 6}};
        int[][] number2Flipped = Q1f.flip(number2);
        System.out.println("Expected: \n88\n9\n4\n6\n");
        System.out.print("Result  :\n");
        for (int[] d1 : number2Flipped) {
            for (int d2 : d1) {
                System.out.print(d2 + " ");
            }
            System.out.println();
        }

        int[][] number3 = {{1, 2, 3}, {8, 7, 6}};
        int[][] number3Flipped = Q1f.flip(number3);
        System.out.println("Expected: \n1 8\n2 7\n3 6\n");
        System.out.print("Result  :\n");
        for (int[] d1 : number3Flipped) {
            for (int d2 : d1) {
                System.out.print(d2 + " ");
            }
            System.out.println();
        }
    }
}

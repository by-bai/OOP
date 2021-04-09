// You can alter this class, but it won't be marked.

public class Q1bTest {

    public static void main(String[] args) {
        String toMatch = "apple";
        String[] strings = {"pineapple", "apple", "apple", "Apple", "biscuit", "elephant", "custard pie"};
        int count = Q1b.countNumberOfMatches(toMatch, strings);

        System.out.println("Expected: 2");
        System.out.println("Result  : " + count);
    }
}
// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)
public class Q1f {
    /*
     * Takes in a 2D array of integers and returns a new 2D array with the sequences changed.
     *
     * e.g. 1:if the input 2D array looks like this: {{1, 2}, {3, 4}, {5, 6}}, your
     *        method will return a brand new 2D array consisting of the following ints: {{1, 3, 5}, {2, 4, 6}}
     * It's easier to look at it in table form:
     *    input: 1, 2
     *           3, 4
     *           5, 6
     *
     *    to return: 1, 3, 5
     *               2, 4, 6
     *
     * e.g. 2:
     *    input: {{88, 9, 4, 6}}
     *       or: 88 9 4 6
     *
     *    to return: 88
     *               9
     *               4
     *               6
     *
     * e.g. 3:
     *    input: {{1, 2, 3}, {8, 7, 6}}
     *       or: 1 2 3
     *           8 7 6
     *
     *    to return: 1, 8
     *               2, 7
     *               3, 6
     *
     * You can assume that the 2D array passed in is always a rectangular array.
     */

    public static int[][] flip(int[][] numbers) {
        if (numbers == null) return null;
        
        int[][] out = new int[numbers[0].length][numbers.length]; 
        for(int i = 0; i< out.length; i++){
            for(int j = 0; j < out[i].length; j++){
                out[i][j] = numbers[j][i];
            }
        }
        return out;
    }
}
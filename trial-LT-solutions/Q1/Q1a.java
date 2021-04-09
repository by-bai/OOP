// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)
public class Q1a {

    /*
     * Takes in 2 arrays of chars, and returns a char array containing combined elements from both inputs
     * e.g.: if a is {'a', 'p', 'p', 'l', 'e'};
     *          b is {'1', '2', '3', '4', '5'};
     * then this method returns an array that contains the following chars:
     *   {'a', '1', 'p', '2', 'p', '3', 'l', '4', 'e', '5'}
     * Note that the first char in the returned array always comes from a. This is followed by
     * the first char from b, then the 2nd char from a, and so on.
     *
     * This method works only if both a and b contain the same number of chars.
     *
     * This method should throw an IllegalInputException if a or b is null, or if the number of
     * elements in a and b are not the same. Insert a relevant message into the exception.
     */
    public static char[] combineTwoCharArrays(char[] a, char[] b) {

        if (a == null || b == null) {
            throw new IllegalInputException("Parameters cannot be null");
        }else if (a.length != b.length) {
            throw new IllegalInputException("Character arrays should be of equal length");
        }

        char[] out = new char[a.length + b.length];

        int idx = 0;
        for (int i = 0; i < a.length ; i++){
            out[idx++] = a[i];
            out[idx++] = b[i];
        }
        return out;
    }
}
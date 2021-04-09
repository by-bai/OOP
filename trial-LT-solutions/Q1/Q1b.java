// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)
public class Q1b {

    /*
     * Takes in a String (toMatch), and an array of Strings (strings) and counts the number of times
     * toMatch appears in strings. This method considers only exact matching (case sensitive).
     *
     * e.g.: if toMatch is "apple"
     *          strings is {"pineapple", "apple", "apple", "Apple", "biscuit", "elephant", "custard pie"}
     * then this method should return 2 (only the 2nd and 3rd elements in strings match).
     *
     * This method returns 0 if any of the input parameters is null, or if there is no match.
     */
    public static int countNumberOfMatches(String toMatch, String[] strings) {
        
        if (toMatch == null || strings == null){
            return 0; 
        }
       
        int match = 0;
        for (String s: strings){
            if (s.equals(toMatch)) match++;
        }
        return match;
    }
}
// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)
public class Q1d {
    /*
     * Takes in 2 arrays of ints, and returns an int array containing combined elements from both
     * inputs sorted in ascending order.
     *
     * You can assume that the 2 input arrays are ALWAYS SORTED in ascending order already.
     *
     * e.g.: if sortedA is {1, 5, 7, 8, 10, 55}
     *          sortedB is {2, 5, 5, 13, 18, 54, 60}
     * then this method returns an array that contains the following ints:
     *   {1, 2, 5, 5, 5, 7, 8, 10, 13, 18, 54, 55, 60}
     *
     * This method should throw an IllegalInputException if a or b is null.
     * Insert a relevant message into the exception.
     */

    public static int[] combineTwoIntArraysSorted(int[] sortedA, int[] sortedB) {
        
        if(sortedA == null ||  sortedB == null){
            throw new IllegalInputException("Input paramters cannot be null");
        }

        int resultInt = sortedA.length + sortedB.length;
        int[] result =  new int[resultInt];

        int currentIndexA = 0;
        int currentIndexB = 0;
        
        for (int i = 0; i < result.length; i++){
            if(currentIndexA >= sortedA.length){
                result[i] = sortedB[currentIndexB];
                currentIndexB ++;
            }else if(currentIndexB >= sortedB.length){
                result[i] = sortedA[currentIndexA];
                currentIndexB ++;
            }else if (sortedA[currentIndexA] < sortedB[currentIndexB] ){
                result[i] = sortedA[currentIndexA];
                currentIndexA ++;
            }else{
                result[i] = sortedB[currentIndexB];
                currentIndexB ++;
            }
        }
        return result;


    }
}

import java.util.*;

public class ArrayUtility {

    public static String printArray(int[] array) {
        String numString = ""; 
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                numString += array[i]; 
            } else {
                numString += array[i] + ", "; 
            }
            
        }
        return numString;

    }

    public static int sum(int[] numArray) {
        int sumOfArray = 0;

        if (numArray == null) { 
            return sumOfArray;
        }
        for (int i = 0; i < numArray.length; i++) {
            sumOfArray += numArray[i];
        }
        return sumOfArray;
    }

    public static int[] twoTimes(int[] original) {
        
        if (original == null) { 
            return null;
        }
        int[] result = new int[original.length];

        //how to return empty array?
        if (original.length == 0) {
            return original;
        }

        for (int i = 0; i < original.length; i++) {
            result[i] = original[i] * 2;
        }
        return result; 
    }

    public static void reverse(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < copy.length; i++) {
            array[i] = copy[copy.length-1-i]; 
        }
        
    }
}

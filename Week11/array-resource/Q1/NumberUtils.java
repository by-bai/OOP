import java.util.*;

public class NumberUtils {
    public static Map<Integer, Integer> calculateFrequency(int[] arr) {
        if (arr == null){
            throw new IllegalArgumentException(); // why is it IAE? see line 11 
        }
        // prof say use Map<Integer,.... instead
        HashMap<Integer, Integer> map = new HashMap<>();

        // List --> size() (method)
        // String --> Length() (method)
        // arrays --> length() (attribute) 

        for (int a : arr) {
            int count = 0; 
            if (map.containsKey(a)) {
                count = map.get(a);
            }
            count += 1;
            map.put(a, count); 
        }

        // ans:

        // for (int i= 0; i < arr.length; i++) {
        //     Integer freq = result.get(arr[i]);
        //     if (freq == null) {
        //         freq = 0; 
        //     }
        //     result.put(arr[i], freq + 1); 
        // }

        // attempt:

        // for (int i = 0; i < arr.length ; i++) {
        //     int count = 1;
        //     if (map.get(arr[i]) == null) {
        //         map.put(arr[i], count);
        //     } else {
        //         count += 1;
        //         map.put(arr[i], count); 
        //     }
        // }
        // for (int a : arr) {
        //     int count = 1;
        //     if (map.get(a) == null) {
        //         map.put(a, count);
        //     } else {
        //         count += 1;
        //         map.put(a, count); 
        //     }
        // }
        System.out.println(map);
        return map; 
    }

    public static int[] createArray(Map<Integer, Integer> freqMap) {

        if (freqMap == null) {
            throw new IllegalArgumentException(); 
        }

        Collection<Integer> values = freqMap.values(); //.values to know the size that you need
        int sum = 0;
        for (int freq : values) {
            sum += freq;
        }
        int[] result = new int[sum]; 
        Set<Integer> keys = freqMap.keySet();
        int pos = 0;
        for (int num : keys) { //get num of times i need to put the num into array??
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                result[pos++] = num; 
            }
        }
        return result; 



    }

    // public static int max(int x, int y, int z) {
    //     return Math.max(Math.max(x,y), z); 
    // }

    // public static int max(int[] arr) {
    //     if (arr.length == 0 || arr == null) {
    //         throw new IllegalArgumentException();
    //     } 
    //     return Arrays.stream(arr).max().getAsInt();
    // }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) 
            throw new IllegalArgumentException();
        
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int max(int x, int y, int z) {
        return Math.max(Math.max(x,y),z);
    }

    public static List<Pair> findPairs(int[] arr, int value) {
        List<Pair> res = new ArrayList<>();

        if (arr == null) 
            return res;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    res.add(new Pair(arr[i],arr[j]));
                }
            }
        }
        return res;
    }

    //Arithmetic Progression





    public static int findTheMissingNumber(int[] arr, int n) {

        //test 2 fails

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(); 
        }

        Arrays.sort(arr); 
        for (int i = 0; i < n; i++ ) {
            if (i+1 != arr[i]) {
                return i+1;
            } 
            
        }
        return 0; 
    }

}

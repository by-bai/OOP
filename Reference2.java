public class Reference2 {
    // mock labs 4 Q1a --> dont actually need to solve with a list.
public static void main(String[] args) {
    List<Character> c = new ArrayList<>();
    c.add('c');
    c.add('b');
    c.add('a');
    String s = c.stream()
                .map(ch -> String.valueOf(ch))
                .collect(Collectors.joining());
    char[] array = s.toCharArray();
}

//if i dont know the size of array, how to create array of unknown size? -> you can't.
//mock labs 4 - humans below age

public static void main(String[] args) {
    List<String> values = new ArrayList<>();
    values.add("apple");
    values.add("orange"); 
    values.add("pear");
    //method 1 : "i need you to give me an array of the String data type"
    // the String array 0 will be thrown away and a String array w the right size will be returned
    String[] arr = values.toArray(new String[0]); //specify 0 length array, what it needs is just the data type?
    String[] arr = new String(values.size());

    // method 2, returns same as method 1.
    String[] returned = values.toArray(arr); 
    System.out.println(arr.length); 
    // values.toArray(); // returns an object array; wrong
    
}

// convert list of integer ??
// read up on lambda/streams over summer 
List<Integer> values = new ArrayList<>();
values.add(1);
values.add(2);
values.add(3);
int[] arr = valiues.stream().maptoInt

//q1a
public static char[] combineTwoCharArrays(char[] a, char[] b) {
    int[] result = new int[a.length + b.length];

    if (a == null || b == null) {
        throw new IllegalInputException("XX");
    }

    if (a.length != b.length) {
        throw new IllegalInputException("XX"); 
    }

    for (int i = 0; i < a.length, i++) {
        //result[0] = a[0]
        //result[1] = b[0]
        //result[2] = a[1]
        //result[3] = b[1]
        result[i*2] = a[i];
        result[i*2+1] = b[i]; 
    }
    return result; 
}

//1c

public static Human getOldest(Human[] humans) {

    if (humans == null || humans.length == 0) {
        return null;
    }

    Human oldest = humans[0];
    for (int i = 1; i < humans.length; i++) {
        if (humans[i].getAge() > oldest.getAge()) {
            oldest = humans[i]; 
        }
    }

}

//1d 

public static int[] combineTwoIntArraysSorted(int[] sortedA, int[] sortedB) {
    int[] result = new int[sortedA.length + sortedB.length];
    System.arraycopy(sortedA, 0, result, 0, sortedA.length); // o(n)
    System.arraycopy(sortedB, 0, result, sortedA.length, sortedB.length); // o(n) 
    Arrays.sort(result); 

    return(result);


    // the above is merge sort o(log n) 
}
}
